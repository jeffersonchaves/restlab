package br.edu.ifpr.restlab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifpr.restlab.DTO.GameDTO;
import br.edu.ifpr.restlab.DTO.GameMinDTO;
import br.edu.ifpr.restlab.entities.Belonging;
import br.edu.ifpr.restlab.entities.Game;
import br.edu.ifpr.restlab.repositories.BelongingRepository;
import br.edu.ifpr.restlab.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Autowired 
    BelongingRepository belongingRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){

        return gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();

    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        
        return new GameDTO(gameRepository.findById(id).get());

    }

    @Transactional(readOnly = true)
    public List<Belonging> findByGameListId(Long id){
        
        return belongingRepository.findByGameListId(id);

    }

    
}
