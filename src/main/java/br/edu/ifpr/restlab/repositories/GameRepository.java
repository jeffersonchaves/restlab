package br.edu.ifpr.restlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpr.restlab.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
