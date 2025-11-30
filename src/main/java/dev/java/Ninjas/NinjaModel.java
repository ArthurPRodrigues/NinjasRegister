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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_register")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private int idade;

	@Column(name = "img_url")
	private String imgUrl;

	@Column(name = "rank")
	private String rank;

	@ManyToOne
	@JoinColumn(name = "mission_id")
	private MissionsModel mission;
}
