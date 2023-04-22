package com.Onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.Onpe.service.IVotacionServices;






@Configuration
@CrossOrigin
@Controller

public class OnpeController  extends WebMvcAutoConfiguration{
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		
	}
    @Autowired
    private IVotacionServices iVotacionService;
    

    
	  
    @GetMapping("/actas_numero/{id}")
    public String Listar(Model modelo,@PathVariable("id")String id) {
    	modelo.addAttribute("actas", iVotacionService.getGrupoVotacion(id));
    	return"actas_por_numero";
    }
    
    @RequestMapping("/actas_numero")
    public String acta(Model modelo ,@RequestParam("nroMesa") String nroMesa) {
    	
    	modelo.addAttribute("actas",iVotacionService.getGrupoVotacion(nroMesa));
    	return  "actas_por_numero";
    	
    
    } 

}
