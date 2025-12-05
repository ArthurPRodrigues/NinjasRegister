package dev.java.ninjas;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

	private final ModelMapper modelMapper;

	public NinjaMapper() {
		this.modelMapper = new ModelMapper();
	}

	public NinjaModel map(NinjaDTO ninjaDTO) {
		return modelMapper.map(ninjaDTO, NinjaModel.class);
	}

	public NinjaDTO map(NinjaModel ninjaModel) {
		return modelMapper.map(ninjaModel, NinjaDTO.class);
	}

}
