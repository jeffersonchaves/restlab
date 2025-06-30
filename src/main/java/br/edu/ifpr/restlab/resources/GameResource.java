package br.edu.ifpr.restlab.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.restlab.DTO.GameDTO;
import br.edu.ifpr.restlab.DTO.GameMinDTO;
import br.edu.ifpr.restlab.entities.Belonging;
import br.edu.ifpr.restlab.entities.Game;
import br.edu.ifpr.restlab.services.GameService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/games")
public class GameResource {
    
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
        
        return gameService.findById(id);

    }
}
