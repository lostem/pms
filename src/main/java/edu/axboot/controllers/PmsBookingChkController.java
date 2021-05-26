package edu.axboot.controllers;

import com.chequer.axboot.core.api.response.ApiResponse;
import com.chequer.axboot.core.controllers.BaseController;
import edu.axboot.domain.booking.BookingChk;
import edu.axboot.domain.booking.BookingChkService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;


@Controller
@RequestMapping(value = "/api/v1/booking")
public class PmsBookingChkController extends BaseController {

    @Inject
    private BookingChkService bookingChkService;

    @RequestMapping(method = RequestMethod.PUT, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody BookingChk request) {
        bookingChkService.bookingSave(request);
        return ok();
    }
}
