package org.sid.dao;

import org.sid.entities.CommandeChef;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommandeChefRepository extends JpaRepository<CommandeChef, Integer>{
	@Query("select com from CommandeChef com where com.organismeformateur like:a")
	public Page<CommandeChef> ChercherCommande(@Param("a")String McCom, Pageable pageable);
}
