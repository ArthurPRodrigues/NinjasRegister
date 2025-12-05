package dev.java.ninjas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import dev.java.missions.MissionModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

	private long id;
	private String name;
	private String email;
	private String imgUrl;
	private int age;
	private MissionModel missions;
}
