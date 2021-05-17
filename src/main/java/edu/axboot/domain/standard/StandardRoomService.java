package edu.axboot.domain.standard;

import com.querydsl.core.BooleanBuilder;
import edu.axboot.domain.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service
public class StandardRoomService extends BaseService<StandardRoom, Long> {
    private static final Logger logger = LoggerFactory.getLogger(StandardRoomService.class);

    @Inject
    private StandardRoomRepository standardRoomRepository;

    @Transactional
    public List<StandardRoom> roomList(String roomTypCd) {
        BooleanBuilder builder = new BooleanBuilder();

        if(isNotEmpty(roomTypCd)) {
            builder.and(qStandardRoom.roomTypCd.eq(roomTypCd));
        }
        List<StandardRoom> roomList = select()
                .from(qStandardRoom)
                .where(builder)
                .orderBy(qStandardRoom.roomNum.asc())
                .fetch();

        return roomList;
    }

    @Transactional
    public List<Long> save(List<StandardRoom> dtos) {
        List<Long> ids = new ArrayList<Long>();
        for (StandardRoom dto: dtos) {
            if (dto.is__deleted__()) {
                standardRoomRepository.delete(dto.getId());
                ids.add(dto.getId());
            } else {
                ids.add(standardRoomRepository.save(dto).getId());
            }
        }
        return ids;
    }

}


