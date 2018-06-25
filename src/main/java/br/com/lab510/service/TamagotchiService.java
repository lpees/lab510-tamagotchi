package br.com.lab510.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.lab510.db.repository.TamagotchiRepository;
import br.com.lab510.dto.TamagotchiDTO;
import br.com.lab510.model.Tamagotchi;

@RestController
@RequestMapping("/v1")
public class TamagotchiService {

	@Autowired
	private TamagotchiRepository tamagotchiRepo;

	@GetMapping("/tamagotchis")
	public ResponseEntity<List<TamagotchiDTO>> getAllTamagotchis() {
		return ResponseEntity.status(HttpStatus.OK).body(tamagotchiRepo.getAllTamagotchi());
	}
	
	@GetMapping("/tamagotchi/{id}")
	public ResponseEntity<TamagotchiDTO> getTamagotchi(@PathVariable(value = "id") Long id) {	
		return ResponseEntity.status(HttpStatus.OK).body(tamagotchiRepo.getTamagotchi(id));
	}
	
	@PostMapping("/tamagotchi")
	public ResponseEntity<?> addNewTamagotchi(@RequestBody Tamagotchi tamagotchi) {
		tamagotchiRepo.insertTamagotchi(tamagotchi);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
