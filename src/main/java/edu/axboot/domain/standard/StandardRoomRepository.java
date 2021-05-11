package edu.axboot.domain.standard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRoomRepository extends JpaRepository<StandardRoom, Long> {
}