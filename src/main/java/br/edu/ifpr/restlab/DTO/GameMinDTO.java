package br.edu.ifpr.restlab.DTO;

import br.edu.ifpr.restlab.entities.Game;
import lombok.Data;

@Data
public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
    
    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }

    
    
}
