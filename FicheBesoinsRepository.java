package org.sid.dao;

import org.sid.entities.FicheBesoins;
import org.sid.entities.Utilisateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FicheBesoinsRepository extends JpaRepository<FicheBesoins, Integer> {
	@Query("select f from FicheBesoins f where f.nom like:x")
public Page<FicheBesoins> chercherficher(@Param("x")String mc, Pageable pageable);
	
}
