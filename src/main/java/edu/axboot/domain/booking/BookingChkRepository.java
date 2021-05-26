package edu.axboot.domain.booking;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingChkRepository extends AXBootJPAQueryDSLRepository<BookingChk, Long> {
}
