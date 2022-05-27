package foi.gestormultimedia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import foi.gestormultimedia.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, String> {

}