package edu.axboot.domain.standard;

import com.querydsl.core.BooleanBuilder;
import edu.axboot.domain.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StandardRoomService extends BaseService<StandardRoom, Long> {
    private StandardRoomRepository standardRoomRepository;

    @Transactional
    public List<StandardRoom> standardgetList(String roomTypCd) {
        BooleanBuilder builder = new BooleanBuilder();

        if(isNotEmpty(roomTypCd)) {
            builder.and(qstandardRoom.roomTypCd.eq(roomTypCd));
        }
        List<StandardRoom> roomList = select()
                .from(qstandardRoom)
                .where(builder)
                .orderBy(qstandardRoom.roomNum.asc())
                .fetch();

        return roomList;
    }

    public void standardDelete(Long id) {
        for (Long id : ids) {
            deleteUsingQueryDsl(id);
        }
    }

//    public Long save(StandardSaveResponeDto responeDto) {
//        return standardRoomRepository.save(responeDto.toEntity()).getId();
//
//    }

}
