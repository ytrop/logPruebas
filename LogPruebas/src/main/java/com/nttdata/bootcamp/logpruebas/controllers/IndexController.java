package com.nttdata.bootcamp.logpruebas.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class IndexController {
	
	private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	public IndexController(){
		
	}
	@GetMapping
	
	public ResponseEntity<String> index(){
		logger.info("llamada al endpoint inicial.");
		return new ReponseEntity<String>(HttpStatus.OK).ok("Hola");
	}
}
