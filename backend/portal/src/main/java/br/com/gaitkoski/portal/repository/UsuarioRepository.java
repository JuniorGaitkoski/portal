package br.com.gaitkoski.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gaitkoski.portal.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
