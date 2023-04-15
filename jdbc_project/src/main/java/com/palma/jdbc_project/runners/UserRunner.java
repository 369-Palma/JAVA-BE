package com.palma.jdbc_project.runners;


import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.palma.jdbc_project.configuration.UserConfiguration;
import com.palma.jdbc_project.model.User;

@Component
public class UserRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		createNewUserRunner();
		createAdminRunner();
		createCustomUserRunner();
		createFakeUserRunner();
	}
	
		public void createNewUserRunner() {
			AnnotationConfigApplicationContext appContext = 
					new AnnotationConfigApplicationContext(UserConfiguration.class);		
			User u1 = (User) appContext.getBean("newUser");
			System.out.println(u1);
			appContext.close();
	}
		
		public void createAdminRunner() {
			AnnotationConfigApplicationContext appContext = 
					new AnnotationConfigApplicationContext(UserConfiguration.class);		
			User u2 = (User) appContext.getBean("adminUser");
			System.out.println(u2);
			appContext.close();
	}
		
		public void createCustomUserRunner() {
			AnnotationConfigApplicationContext appContext = 
					new AnnotationConfigApplicationContext(UserConfiguration.class);		
			User u3 = (User) appContext.getBean("customUser");
			System.out.println(u3);
			appContext.close();
	}
	
		public void createFakeUserRunner() {
			AnnotationConfigApplicationContext appContext = 
					new AnnotationConfigApplicationContext(UserConfiguration.class);		
			User u3 = (User) appContext.getBean("randomUser");
			System.out.println(u3);
			appContext.close();
	}
}
