package edu.axboot.domain.booking.dto;

import edu.axboot.domain.booking.BookingChk;
import lombok.Getter;

@Getter
public class RsvListResponseDto {
    private Long id;
    private String rsvNum;
    private String rsvDt;
    private String arrDt;
    private String depDt;
    private Integer nightCnt;
    private String roomTypCd;
    private String roomNum;
    private String saleTypCd;
    private String srcCd;
    private String sttusCd;
    private String guestNm;

    public RsvListResponseDto(BookingChk entity) {
        this.id = entity.getId();
        this.rsvDt = entity.getRsvNum();
        this.rsvDt = entity.getRsvDt();
        this.arrDt = entity.getArrDt();
        this.depDt = entity.getDepDt();
        this.nightCnt = entity.getNightCnt();
        this.roomTypCd = entity.getRoomTypCd();
        this.roomNum = entity.getRoomNum();
        this.saleTypCd = entity.getSaleTypCd();
        this.srcCd = entity.getSrcCd();
        this.sttusCd = entity.getSttusCd();
        this.guestNm = entity.getGuestNm();
    }
}
