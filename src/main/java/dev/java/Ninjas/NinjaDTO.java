package dev.java.Ninjas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import dev.java.Missions.MissionsModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

	private long id;
	private String name;
	private String email;
	private String imgUrl;
	private int age;
	private MissionsModel missions;
}
