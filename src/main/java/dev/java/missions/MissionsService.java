package dev.java.missions;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissionsService {

	private final MissionsRepository missionsRepository;
	private final MissionMapper missionsMapper;

	public MissionsService(MissionsRepository missionsRepository, MissionMapper missionsMapper) {
		this.missionsRepository = missionsRepository;
		this.missionsMapper = missionsMapper;
	}

	public List<MissionDTO> listMissions() {
		List<MissionModel> missions = missionsRepository.findAll();
		return missions.stream()
				.map(missionsMapper::map)
				.collect(Collectors.toList());
	}

	public MissionDTO listMissionPerId(long id) {
		return missionsRepository.findById(id)
				.map(missionsMapper::map)
				.orElse(null);
	}

	public MissionDTO createMission(MissionDTO missionDTO) {
		MissionModel mission = missionsMapper.map(missionDTO);
		mission = missionsRepository.save(mission);
		return missionsMapper.map(mission);
	}

	public MissionDTO updateMission(Long id, MissionDTO missionDTO) {
		return missionsRepository.findById(id)
				.map(existing -> {
					MissionModel mission = missionsMapper.map(missionDTO);
					mission.setId(id);
					return missionsMapper.map(missionsRepository.save(mission));
				})
				.orElse(null);
	}

	public void deleteMission(Long id) {
		Optional<MissionModel> existingMission = missionsRepository.findById(id);
		if (existingMission.isPresent()) {
			missionsRepository.deleteById(id);
		}
	}
}
