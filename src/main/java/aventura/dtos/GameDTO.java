package aventura.dtos;

import org.springframework.beans.BeanUtils;

import aventura.entities.Game;
import lombok.Data;


@Data
public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
	}

	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

}
