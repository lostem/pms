package edu.axboot.domain.guest;

import com.chequer.axboot.core.parameter.RequestParams;
import com.querydsl.core.BooleanBuilder;
import edu.axboot.domain.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
            builder.and(qStandardGuest.guestNm.contains(guestNm));
        }
        if(isNotEmpty(guestTel)) {
            builder.and(qStandardGuest.guestTel.contains(guestTel));
        }
        if(isNotEmpty(email)) {
            builder.and(qStandardGuest.email.contains(email));
        }

        List<StandardGuest> list = select()
                .from(qStandardGuest)
                .where(builder)
                .orderBy(qStandardGuest.guestNm.asc())
                .fetch();

        return list;
    }

    @Transactional
    public void guestSave(StandardGuest request) {
        if(request.getId() == null || request.getId() == 0) {
            this.standardGuestRepository.save(request);
        } else {
            update(qStandardGuest)
                .set(qStandardGuest.guestNm, request.getGuestNm())
                .set(qStandardGuest.guestNmEng,request.getGuestNmEng())
                .set(qStandardGuest.guestTel, request.getGuestTel())
                .set(qStandardGuest.email, request.getEmail())
                .set(qStandardGuest.brth, request.getBrth())
                .set(qStandardGuest.gender, request.getGender())
                .set(qStandardGuest.langCd, request.getLangCd())
                .set(qStandardGuest.rmk, request.getRmk())
                .execute();
        }
    }

}
