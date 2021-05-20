package edu.axboot.domain.guest;

import com.chequer.axboot.core.parameter.RequestParams;
import com.querydsl.core.BooleanBuilder;
import edu.axboot.domain.BaseService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class StandardGuestService extends BaseService<StandardGuest, Long> {

    @Inject
    private StandardGuestRepository standardGuestRepository;

    public List<StandardGuest> getList(RequestParams<StandardGuest> requestParams) {
        String guestNm = requestParams.getString("guestNm", "");
        String guestTel = requestParams.getString("guestTel", "");
        String email = requestParams.getString("email","");

        BooleanBuilder builder = new BooleanBuilder();

        if(isNotEmpty(guestNm)) {
            builder.and(qGuest.guestNm.contains(guestNm));
        }
        if(isNotEmpty(guestTel)) {
            builder.and(qGuest.guestTel.contains(guestTel));
        }
        if(isNotEmpty(email)) {
            builder.and(qGuest.email.contains(email));
        }

        List<StandardGuest> list = select()
                .from(qGuest)
                .where(builder)
                .orderBy(qGuest.guestNm.asc())
                .fetch();

        return list;
    }


    public void guestSave(StandardGuest request) {
        if(request.getId() == null || request.getId() == 0) {
            this.standardGuestRepository.save(request);
        } else {
            update(qGuest)
                    .set(qGuest.guestNm, request.getGuestNm())
                    .set(qGuest.guestNmEng,request.getGuestNmEng())
                    .set(qGuest.guestTel, request.getGuestTel())
                    .set(qGuest.email, request.getEmail())
                    .set(qGuest.brth, request.getBrth())
                    .set(qGuest.gender, request.getGender())
                    .set(qGuest.langCd, request.getLangCd())
                    .set(qGuest.rmk, request.getRmk())
                    .execute();
        }
    }
}
