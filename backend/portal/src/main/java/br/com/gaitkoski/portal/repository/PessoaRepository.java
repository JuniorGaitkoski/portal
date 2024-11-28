package br.com.gaitkoski.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gaitkoski.portal.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
