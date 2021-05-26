package edu.axboot.domain.booking;

import edu.axboot.domain.BaseService;
import edu.axboot.domain.guest.StandardGuestRepository;
import edu.axboot.domain.memo.ChkMemoRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class BookingChkService extends BaseService<BookingChk, Long> {

    @Inject
    private BookingChkRepository bookingChkRepository;

    @Inject
    private StandardGuestRepository standardGuestRepository;

    @Inject
    private ChkMemoRepository chkMemoRepository;

    public void bookingSave(BookingChk request) {
        BookingChk chk = null;
        if (request.getId() == null || request.getId() == 0) {
            chk = bookingChkRepository.save(request);

        }

    }
}