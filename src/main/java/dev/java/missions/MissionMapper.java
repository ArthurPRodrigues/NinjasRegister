package dev.java.missions;

import org.modelmapper.ModelMapper;

public class MissionMapper {

	private final ModelMapper modelMapper;

	public MissionMapper() {
		this.modelMapper = new ModelMapper();
	}

	public MissionModel map(MissionDTO missionDTO) {
		return modelMapper.map(missionDTO, MissionModel.class);
	}

	public MissionDTO map(MissionModel missionsModel) {
		return modelMapper.map(missionsModel, MissionDTO.class);
	}

}
