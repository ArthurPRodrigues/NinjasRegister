package dev.java.Ninjas;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
	private final NinjaMapper ninjaMapper;

	public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
		this.ninjaRepository = ninjaRepository;
		this.ninjaMapper = ninjaMapper;
	}

	public List<NinjaDTO> listNinja() {
		List<NinjaModel> ninjas = ninjaRepository.findAll();
		return ninjas.stream()
				.map(ninjaMapper::map)
				.collect(Collectors.toList());
	}

	public NinjaDTO listNinjaPerId(long id) {
		Optional<NinjaModel> ninjaPerId = ninjaRepository.findById(id);
		return ninjaPerId.map(ninjaMapper::map).orElse(null);
	}

	public NinjaDTO createNinja(NinjaDTO ninjaDTO) {
		NinjaModel ninja = ninjaMapper.map(ninjaDTO);
		ninja = ninjaRepository.save(ninja);
		return ninjaMapper.map(ninja);
	}

	public NinjaDTO updateNinja(Long id, NinjaDTO ninjaDTO) {
		Optional<NinjaModel> existingNinja = ninjaRepository.findById(id);
		if (existingNinja.isPresent()) {
			NinjaModel ninjaToUpdate = ninjaMapper.map(ninjaDTO);
			ninjaToUpdate.setId(id);
			NinjaModel savedNinja = ninjaRepository.save(ninjaToUpdate);
			return ninjaMapper.map(savedNinja);
		}
		return null;
	}

	public void deleteNinja(Long id) {
		Optional<NinjaModel> existingNinja = ninjaRepository.findById(id);
		if (existingNinja.isPresent()) {
			ninjaRepository.deleteById(id);
		}
	}
}
