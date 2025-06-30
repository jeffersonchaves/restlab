package br.edu.ifpr.restlab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifpr.restlab.DTO.GameDTO;
import br.edu.ifpr.restlab.DTO.GameMinDTO;
import br.edu.ifpr.restlab.entities.Belonging;
import br.edu.ifpr.restlab.entities.GameList;
import br.edu.ifpr.restlab.repositories.BelongingRepository;
import br.edu.ifpr.restlab.repositories.GameListRepository;
import br.edu.ifpr.restlab.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Autowired 
    BelongingRepository belongingRepository;

    @Transactional(readOnly = true)
    public List<GameList> findAll(){
        return gameListRepository.findAll();
    }

    @Transactional(readOnly = true)
    public GameList findById(Long id){
        
        return gameListRepository.findById(id).get();

    }

    @Transactional(readOnly = true)
    public List<Belonging> findByGameListId(Long id){
        
        return belongingRepository.findByGameListId(id);

    }

    
}
