package com.Onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Onpe.model.Votacion;
import com.Onpe.repository.IVotacion;

@Service


public class VotacionService implements IVotacionServices   {
	@Autowired 
	IVotacion iVotacion;
	@Override
	public Votacion getGrupoVotacion(String id){
		return iVotacion.getGrupoVotacion(id);
	}
	

}
