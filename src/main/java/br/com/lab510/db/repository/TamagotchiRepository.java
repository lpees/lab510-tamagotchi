package br.com.lab510.db.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.lab510.db.DatabaseConfig;
import br.com.lab510.dto.TamagotchiDTO;
import br.com.lab510.model.Tamagotchi;
import lombok.Data;

@Repository
@Data
public class TamagotchiRepository {
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(DatabaseConfig.dataSource());
	
	public List<TamagotchiDTO> getAllTamagotchi(){
		return jdbcTemplate.query("SELECT * FROM TAMAGOTCHI", 
				(rs, rowNum) -> new TamagotchiDTO(new Tamagotchi(rs.getLong("id"), rs.getString("name"), rs.getString("nickname"), rs.getString("birthday"))));
	}
	
	public TamagotchiDTO getTamagotchi(Long id) {
		return jdbcTemplate.queryForObject("SELECT * FROM TAMAGOTCHI WHERE ID = ?", new Object[]{ id }, 
				(rs, rowNum) -> new TamagotchiDTO(new Tamagotchi(rs.getLong("id"), rs.getString("name"), rs.getString("nickname"), rs.getString("birthday"))));
	}
	
	public void insertTamagotchi(Tamagotchi tamagotchi) {
		jdbcTemplate.update("INSERT INTO TAMAGOTCHI(name, nickname, birthday) VALUES ( ? , ?, ? )", tamagotchi.getName(), tamagotchi.getNickname(), tamagotchi.getBirthDay());
	}

}
