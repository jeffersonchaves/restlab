package br.edu.ifpr.restlab.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_belonging")
@Data
public class Belonging {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private Integer position;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "game_list_id")
    private GameList gameList;


}