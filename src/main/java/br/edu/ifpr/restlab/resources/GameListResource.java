package br.edu.ifpr.restlab.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpr.restlab.entities.Belonging;
import br.edu.ifpr.restlab.entities.GameList;
import br.edu.ifpr.restlab.repositories.BelongingRepository;
import br.edu.ifpr.restlab.repositories.GameListRepository;
import br.edu.ifpr.restlab.services.GameListService;

@RestController
@RequestMapping("/gamelist")
public class GameListResource {
    
    @Autowired
    GameListRepository gameListRepository;

    @Autowired
    BelongingRepository belongingRepository;

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameList> findAll(){

        return gameListRepository.findAll();

    }

    @GetMapping("/teste")
    public List<Belonging> findAllByList(){


        return belongingRepository.findAll();

    }

    @GetMapping("/{id}/games")
    public List<Belonging> findGamesByGameListId(@PathVariable Long id){
        
        return gameListService.findByGameListId(id);

    }
}
