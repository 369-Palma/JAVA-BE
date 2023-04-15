package com.spring_configuration.spring_configuration.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

 @Data @NoArgsConstructor @AllArgsConstructor
public class Test {
	
	private String name;
	
	public String saluta() {
		return "Ciao" + this.name;		
	}

}
