package br.com.lab510.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Tamagotchi {
	
	private Long id;
		
	private String name;
	
	private String nickname;
	
	private String birthDay;
	

}
