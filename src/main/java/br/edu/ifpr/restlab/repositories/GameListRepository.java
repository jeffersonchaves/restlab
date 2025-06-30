package br.edu.ifpr.restlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpr.restlab.entities.GameList;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
