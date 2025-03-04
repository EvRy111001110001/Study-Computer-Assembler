package com.evry.studycomputerassembler.repositories;

import com.evry.studycomputerassembler.entity.Compatibility;
import com.evry.studycomputerassembler.entity.Motherboard;
import com.evry.studycomputerassembler.entity.Processor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**

 */
@Repository
public interface CompatibilityRepository extends JpaRepository<Compatibility, Long> {

    @Query(value = "SELECT m.name, m.price " +
            "FROM compatibility c JOIN motherboards m ON " +
            "c.motherboard_id = m.id " +
            "WHERE c.processor_id = :id",
            nativeQuery = true)
    Page<Motherboard> findAllWithProcessor(@Param("id") Long id, Pageable pageable);

    @Query(value = "SELECT p.name, p.price " +
            "FROM compatibility c JOIN processors p ON " +
            "c.processor_id = p.id " +
            "WHERE c.motherboard_id = :id",
            nativeQuery = true)
    Page<Processor> findAllWithMotherboard(@Param("id") Long id, Pageable pageable);
}
