package edu.axboot.controllers;

import com.chequer.axboot.core.api.response.ApiResponse;
import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import edu.axboot.domain.standard.StandardRoom;
import edu.axboot.domain.standard.StandardRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import java.util.List;


@Controller
@RequestMapping(value = "/api/v1/standard/room")
public class PmsStandardController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(PmsStandardController.class);

    @Inject
    private StandardRoomService standardRoomService;

    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse getList(@RequestParam(value = "roomTypCd", required = false) String roomTypCd) {
        List<StandardRoom> list = standardRoomService.roomList(roomTypCd);
        return Responses.ListResponse.of(list);
    }

    @RequestMapping(method = {RequestMethod.POST}, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody List<StandardRoom> request) {
        standardRoomService.save(request);
        return ok();
    }

}
