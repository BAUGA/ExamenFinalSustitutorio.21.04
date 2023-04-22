package com.Onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/actas")
    public String actas() {
	return "actas_por_numero";
     }
    
	  
    @GetMapping("/actas_por_numero/{id}")
    public String listarnum(Model modelo,@PathVariable("id")String id) {
    	modelo.addAttribute("actas", iVotacionService.getGrupoVotacion(id));
    	return"actas_por_numero";
    }

}
