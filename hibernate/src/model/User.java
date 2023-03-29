package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity @Table(name = "users_jpa")
public class User implements Serializable {

	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_user", nullable = false)
	private Long id;
	
	@Column (nullable = false)
	private String name;
	
	@Column (nullable = false, unique = true)
	private String email;
	
	
	
	
}
