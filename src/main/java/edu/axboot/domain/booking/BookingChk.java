package edu.axboot.domain.booking;

import edu.axboot.domain.BaseJpaModel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "PMS_CHK")
public class BookingChk extends BaseJpaModel<Long> {

    @Id
    @Column(name = "ID", precision = 19, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RSV_DT", length = 10, nullable = false)
    private  String  rsvDt;

    @Column(name = "SNO", precision = 10, nullable = false)
    private  Integer  sno;

    @Column(name = "RSV_NUM", length = 20, nullable = false)
    private  String  rsvNum;

    @Column(name = "GUEST_ID", precision = 19)
    private  Long  gusetId;

    @Column(name = "GUEST_NM", length = 100)
    private  String  gusetNm;

    @Column(name = "GUEST_NM_ENG", length = 200)
    private  String  guestNmEng;

    @Column(name = "GUEST_TEL", length = 18)
    private  String  guestTel;

    @Column(name = "EMAIL", length = 100)
    private  String  eamil;

    @Column(name = "LANG_CD", length = 20)
    private  String  langCd;

    @Column(name = "ARR_DT", length = 10, nullable = false)
    private  String  arrDt;

    @Column(name = "ARR_TIME", length = 8)
    private  String  arrTime;

    @Column(name = "DEP_DT", length = 10, nullable = false)
    private  String  edpDt;

    @Column(name = "DEP_TIME", length = 8)
    private  String  depTime;

    @Column(name = "NIGHT_CNT", precision = 10, nullable = false)
    private  Integer  nightCnt;

    @Column(name = "ROOM_TYP_CD", length = 20, nullable = false)
    private  String  roomTypCd;

    @Column(name = "ROOM_NUM", length = 10)
    private  String  roomNum;

    @Column(name = "ADULT_CNT", precision = 10, nullable = false)
    private  Integer  adultCnt;

    @Column(name = "CHLD_CNT", precision = 10, nullable = false)
    private  Integer  childCnt;

    @Column(name = "SALE_TYP_CD", length = 20, nullable = false)
    private  String  saleTypCd;

    @Column(name = "STTUS_CD", length = 20, nullable = false)
    private  String  sttusCd;

    @Column(name = "SRC_CD", length = 20, nullable = false)
    private  String  srcCd;

    @Column(name = "BRTH", length = 10)
    private  String  brth;

    @Column(name = "GENDER", length = 20)
    private  String  gender;

    @Column(name = "PAY_CD", length = 20)
    private  String  payCd;

    @Column(name = "ADVN_YN", length = 1, nullable = false)
    private  String  advnYn;

    @Column(name = "SALE_PRC", precision = 18)
    private BigDecimal salePrc;

    @Column(name = "SVC_PRC", precision = 18)
    private BigDecimal svcPrc;

    @Override
    public Long getId() {
        return id;
    }
}
