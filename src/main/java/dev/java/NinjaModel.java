package dev.java;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This will create a table in the database, therefore, itll be a model part of my db.
@Table(name = "tb_register")
public class NinjaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String email;
	String name;
	int age;

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
