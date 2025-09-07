package dev.java.Ninjas;

import java.util.List;

import dev.java.Missions.MissionModel;
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
	private Long id;
	private String email;
	private String name;
	private int age;
	private List<MissionModel> missions;
	public NinjaModel() {
	}

	public NinjaModel(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}


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
