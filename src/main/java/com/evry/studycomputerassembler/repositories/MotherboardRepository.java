package com.evry.studycomputerassembler.repositories;

import com.evry.studycomputerassembler.entity.Motherboard;
import com.evry.studycomputerassembler.entity.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**

 */
@Repository
public interface MotherboardRepository extends JpaRepository<Motherboard, Long> {
    Optional<Motherboard> findByName(String name);

}
