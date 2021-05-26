package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import galerie.entity.Galerie;

public interface PersonneRepository extends JpaRepository<Galerie, Integer>{

}
