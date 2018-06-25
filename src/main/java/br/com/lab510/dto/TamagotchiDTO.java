package br.com.lab510.dto;

import br.com.lab510.model.Tamagotchi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class TamagotchiDTO {
	
	@NonNull
	private Tamagotchi virtualPet;
	
}
