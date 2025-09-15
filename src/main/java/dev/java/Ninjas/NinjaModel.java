package dev.java.Ninjas;

import dev.java.Missions.MissionsModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // This will create a table in the database, therefore, itll be a model part of my db.
@Table(name = "tb_register")
public class NinjaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column (name = "id")
	private Long id;

	@Column (name = "name")
	private String name;

	@Column (name = "email")
	private String email;

	@Column (name = "age")
	private int age;

	@ManyToOne // Many ninjas can have one mission
	@JoinColumn(name = "missions_id") //FK
	private MissionsModel mission;

	public NinjaModel() {
	}

	public NinjaModel(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}
}
