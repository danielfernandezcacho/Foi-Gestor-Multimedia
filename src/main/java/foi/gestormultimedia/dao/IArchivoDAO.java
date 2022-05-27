package foi.gestormultimedia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import foi.gestormultimedia.dto.Archivo;

public interface IArchivoDAO extends JpaRepository<Archivo, Integer> {

}