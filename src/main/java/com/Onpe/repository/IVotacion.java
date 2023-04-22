package com.Onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Onpe.model.Votacion;


@Repository

public interface IVotacion  extends JpaRepository<Votacion, String> {
	@Query(value= "{call usp_getGrupoVotacion(:id)}",nativeQuery=true)
Votacion getGrupoVotacion(String id);
	
}
