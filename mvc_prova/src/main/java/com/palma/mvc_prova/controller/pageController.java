package com.palma.mvc_prova.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class pageController {

	//SENZA PARAMETRI
	@GetMapping("/homepage")
	public @ResponseBody String getHomePage() {
		return "Welcome to my first mpv test";
	}
	
	
	//CON PARAMETRO PASSATO DA QUI
	
	@GetMapping("/homepage/param")
	public @ResponseBody String setHomePageParam (@RequestParam String prova) {
		return "Welcome to my first mpv test" + "Made by " + prova;
	}
	
	//PAGINA HTML
	@GetMapping("/homepage/thymeleaf")
	public String getHomePageThymeleaf() {
		return "mvc";
	}
	
	//CON PARAMETRO PASSATO DA HTML
	@GetMapping("/homepage/esempio/{test}")
	public String getHomePageParametro(Map <String, Object> model, @PathVariable String test){
		model.put("myParam", test);
		return "mvc";
	}
	
//	@GetMapping("/homepage/es1/{test}")
//	public String getHomePageParam(ModelMap model, @PathVariable String test) {
//		model.addAttribute("myParam", test);
//		return "mvc";
//	}
	
//	@GetMapping("/homepage/thymeleaf/pag2/{myParam}")
//	public ModelAndView getHomePageParam2(@PathVariable String test) {
//		ModelAndView model = new ModelAndView("mvc");
//		model.addObject("myParam", test);
//		return model;
//	}
	}