package aventura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aventura.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
