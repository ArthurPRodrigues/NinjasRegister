package dev.java.Missions;

import java.util.List;

import dev.java.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	private String missionName;
	private String difficultyLevel;
	private String missionStatus;

	@OneToMany(mappedBy = "missions")// Many missions can have one ninja
	private List<NinjaModel> ninjas;

	public MissionsModel() {
	}

	public MissionsModel(String missionName, String difficultyLevel, String missionStatus) {
		this.missionName = missionName;
		this.difficultyLevel = difficultyLevel;
		this.missionStatus = missionStatus;
	}

	public Long getId() {
		return id;
	}

	public String getMissionName() {
		return missionName;
	}

	public String getdifficultyLevel() {
		return difficultyLevel;
	}

	public String getMissionStatus() {
		return missionStatus;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public void setdifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public void setMissionStatus(String missionStatus) {
		this.missionStatus = missionStatus;
	}
}
