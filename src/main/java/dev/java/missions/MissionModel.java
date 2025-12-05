package dev.java.missions;

import java.util.List;

import dev.java.ninjas.NinjaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

	@Column(name = "id")
	private Long id;

	@Column(name = "mission_name")
	private String missionName;

	@Column(name = "difficulty_level")
	private String difficultyLevel;

	@Column(name = "mission_status")
	private String missionStatus;

	@OneToMany(mappedBy = "mission")
	private List<NinjaModel> ninjas;

	public MissionModel() {
	}

	public MissionModel(String missionName, String difficultyLevel, String missionStatus) {
		this.missionName = missionName;
		this.difficultyLevel = difficultyLevel;
		this.missionStatus = missionStatus;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
