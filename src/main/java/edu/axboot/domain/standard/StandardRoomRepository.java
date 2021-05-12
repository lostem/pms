package edu.axboot.domain.standard;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRoomRepository extends AXBootJPAQueryDSLRepository<StandardRoom, Long> {
}
