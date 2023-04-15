package com.spring_configuration.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring_configuration.spring_configuration.configuration.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Configuration
public class ConfigurazioneTest {

	@Bean
	public Test test() {
		return new Test ();
	}
	

}