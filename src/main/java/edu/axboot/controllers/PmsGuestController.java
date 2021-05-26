package edu.axboot.controllers;

import com.chequer.axboot.core.api.response.ApiResponse;
import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import com.chequer.axboot.core.parameter.RequestParams;
import edu.axboot.domain.guest.StandardGuest;
import edu.axboot.domain.guest.StandardGuestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/standard/guest")
public class PmsGuestController extends BaseController {

    @Inject
    private StandardGuestService standardGuestService;

    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse getList(RequestParams<StandardGuest> requestParms) {

        List<StandardGuest> list = standardGuestService.getList(requestParms);
        return Responses.ListResponse.of(list);

    }

    @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody StandardGuest request) {
        standardGuestService.guestSave(request);
        return ok();
    }

}
