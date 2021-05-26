package edu.axboot.domain.memo;

import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChkMemoRepository extends AXBootJPAQueryDSLRepository <ChkMemo, Long> {
}
