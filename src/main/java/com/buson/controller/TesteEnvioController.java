package com.buson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buson.service.TesteEnvioService;

@RestController
@RequestMapping("/envio")
public class TesteEnvioController {
	
	@Autowired
	TesteEnvioService service;
	
}
