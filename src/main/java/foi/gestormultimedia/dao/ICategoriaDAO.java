package foi.gestormultimedia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import foi.gestormultimedia.dto.Categoria;

public interface ICategoriaDAO extends JpaRepository<Categoria, Integer> {

}