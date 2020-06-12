package org.sid.dao;

import org.sid.entities.ConvocationChef;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param; 

public interface ConvocationRepository extends JpaRepository<ConvocationChef, Integer> {
	@Query("select conv from ConvocationChef conv where conv.destinataire like:c")
	public Page<ConvocationChef> ChercherConvocation(@Param("c")String McConv, Pageable pageable);

}
