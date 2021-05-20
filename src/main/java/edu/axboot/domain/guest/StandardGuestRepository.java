package edu.axboot.domain.guest;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardGuestRepository extends AXBootJPAQueryDSLRepository<StandardGuest, Long> {

}
