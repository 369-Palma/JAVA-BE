package com.palma.jdbc_project.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//classe POJO

@Data @NoArgsConstructor @Builder
public class User {
	private Long id;
	private String name;
	private String lastname;
	private String email;
	private Integer age;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", age=" + age
				+ ", password=" + password + "]";
	}

	public User() {};
	
	public User(String name, String lastname, String email, Integer age, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.password = password;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname=lastname;
		
	}

	public void setAge(int age) {
		this.age=age;
		
	}

	public void setPassword(String password) {
		this.password=password;
		
	}

	public String getName() {
		return name;
		
	}
	
	public String getLastname() {
		return lastname;
		
	}

	public void setEmail(String email) {
		this.email=email;
		
	}

}
