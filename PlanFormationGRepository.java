package org.sid.dao;

import org.sid.entities.PlanFormationGeneral;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlanFormationGRepository extends JpaRepository<PlanFormationGeneral, Integer> {
@Query("select p from PlanFormationGeneral p where p.matricule like:s")
public Page<PlanFormationGeneral> ChercherPlan(@Param("s")Number mat, Pageable pageable );
}
