package dev.java.Missions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	private String missionName;
	private String missionType;
	private String missionStatus;
	public MissionModel() {
	}

	public MissionModel(String missionName, String missionType, String missionStatus) {
		this.missionName = missionName;
		this.missionType = missionType;
		this.missionStatus = missionStatus;
	}

	public Long getId() {
		return id;
	}

	public String getMissionName() {
		return missionName;
	}

	public String getMissionType() {
		return missionType;
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

	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}

	public void setMissionStatus(String missionStatus) {
		this.missionStatus = missionStatus;
	}
}
