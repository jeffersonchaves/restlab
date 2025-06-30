package br.edu.ifpr.restlab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.ifpr.restlab.entities.Belonging;
import br.edu.ifpr.restlab.entities.Game;

@Repository
public interface BelongingRepository extends JpaRepository<Belonging, Long>{


    List<Belonging> findByGameListId(Long gameListId);


     // Retorna diretamente os Games de uma lista
    @Query("SELECT b.game FROM Belonging b WHERE b.gameList.id = :gameListId")
    List<Game> findGamesByGameListId(@Param("gameListId") Long gameListId);

}
