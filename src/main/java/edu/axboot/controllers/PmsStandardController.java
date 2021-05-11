package edu.axboot.controllers;

import com.chequer.axboot.core.api.response.ApiResponse;
import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import edu.axboot.domain.standard.StandardRoom;
import edu.axboot.domain.standard.StandardRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;


@Controller
@RequestMapping(value = "api/v1/standard/room")
public class PmsStandardController extends BaseController {

    @Inject
    private StandardRoomService standardRoomService;

    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse getList(@RequestParam(value = "roomTypCd", required = false) String roomTypCd) {
        List<StandardRoom> list = standardRoomService.standardgetList(roomTypCd);
        return Responses.ListResponse.of(list);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody StandardRoom request) {
        standardRoomService.standardSave(request);
        return ok();
    }

    @RequestMapping( method = RequestMethod.DELETE, produces = APPLICATION_JSON)
    public ApiResponse delete(@RequestParam List<Long> ids) {
        standardRoomService.standardDelete(ids);

        return ok();
    }
}
