package dev.java.missions;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissionDTO {
	private Long id;
	private String nome;
	private String descricao;
	private String dificuldade;
	private String status;
}
