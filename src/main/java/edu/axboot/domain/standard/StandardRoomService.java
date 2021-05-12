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
    public long roomSave(List<StandardRoom> requests) {
        long result = 0;
        for (StandardRoom room : requests) {
            if (room.isCreated()) {
                StandardRoom roomObj = save(room);
                result = roomObj.getId();
            } else if (room.isModified()) {
                result = update(qStandardRoom)
                        .set(qStandardRoom.roomTypCd, room.getRoomTypCd())
                        .set(qStandardRoom.dndYn, room.getDndYn())
                        .set(qStandardRoom.ebYn, room.getEbYn())
                        .set(qStandardRoom.roomSttusCd, room.getRoomSttusCd())
                        .set(qStandardRoom.clnSttusCd, room.getClnSttusCd())
                        .set(qStandardRoom.svcSttusCd, room.getSvcSttusCd())
                        .where(qStandardRoom.id.eq(room.getId()))
                        .execute();
            } else if(room.isDeleted()) {
                result = delete(qStandardRoom)
                        .where(qStandardRoom.id.eq(room.getId()))
                        .execute();
            }
        }
        return result;
    }


    }


