package com.gruop.ataehpdcdc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_user")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size (min = 2, message = "O atributo é obrigatório!")
	private String name;
	
	@NotBlank (message = "O atributo é obrigatório!")
	@Size (min = 2, message = "Esse não é um email válido!")
	private String email;
	
	@NotBlank
	@Size (min = 8, message = "A senha deve conter o minímo 8 caracteres!")
	private String password;
	
	private String photo;
	
	public UserModel (Long id, String name, String email, String password, String photo) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.photo = photo;
	}

	public UserModel () {}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
