package edu.axboot.domain.booking;

import edu.axboot.domain.BaseService;
import edu.axboot.domain.booking.dto.RsvSaveRequestDto;
import edu.axboot.domain.guest.StandardGuest;
import edu.axboot.domain.guest.StandardGuestRepository;
import edu.axboot.domain.memo.ChkMemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BookingChkService extends BaseService<BookingChk, Long> {

    private final BookingChkRepository bookingChkRepository;
    private final StandardGuestRepository standardGuestRepository;
    private final ChkMemoRepository chkMemoRepository;

    @Transactional
    public long save(RsvSaveRequestDto saveDto) {
        long id = 0;

        StandardGuest guest = StandardGuest.builder()
                .id(saveDto.getGuestId())
                .guestNm(saveDto.getGuestNm())
                .guestNmEng(saveDto.getGuestNmEng())
                .guestTel(saveDto.getGuestTel())
                .email(saveDto.getEmail())
                .brth(saveDto.getBrth())
                .gender(saveDto.getGender())
                .langCd(saveDto.getLangCd())
                .build();

        return id;

    }


}