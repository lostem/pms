package edu.axboot.domain.standard;
import com.chequer.axboot.core.annotations.ColumnPosition;
import edu.axboot.domain.BaseJpaModel;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "PMS_ROOM")
@DynamicInsert
@DynamicUpdate
public class StandardRoom extends BaseJpaModel<Long> {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @ColumnPosition(1)
    private Long id;

    @Column(name = "ROOM_NUM", length = 10)
    @NotNull
    @ColumnPosition(2)
    private String roomNum;

    @Column(name = "ROOM_TYP_CD", length = 20)
    @NotNull
    @ColumnPosition(3)
    private String roomTypCd;

    @Column(name = "DND_YN", length = 1, columnDefinition = "N")
    @NotNull
    @ColumnPosition(4)
    private String dndYn;

    @Column(name = "EB_YN", length = 1, columnDefinition  = "N")
    @NotNull
    @ColumnPosition(5)
    private String ebYn;

    @Column(name = "ROOM_STTUS_CD", length = 20)
    @ColumnPosition(6)
    private String roomSttusCd;

    @Column(name = "CLN_STTUS_CD", length = 20)
    @ColumnPosition(7)
    private String clnSttusCd;

    @Column(name = "SVC_STTUS_CD", length = 20)
    @ColumnPosition(8)
    private String svcSttusCd;

    @Override
    public Long getId() {
        return id;
    }

//    @Builder
//    public StandardRoom(String roomNum, String roomTypCd, String dndYn, String ebYn, String roomSttusCd,
//                        String clnSttusCd, String  svcSttusCd) {
//        this.roomNum = roomNum;
//        this.roomTypCd = roomTypCd;
//        this.dndYn = dndYn;
//        this.ebYn = ebYn;
//        this.roomSttusCd = roomSttusCd;
//        this.clnSttusCd = clnSttusCd;
//        this.svcSttusCd = svcSttusCd;
//    }
}