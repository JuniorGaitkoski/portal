package br.com.gaitkoski.portal.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.gaitkoski.portal.model.Categoria;
import br.com.gaitkoski.portal.model.Noticia;
import br.com.gaitkoski.portal.repository.CategoriaRepository;
import br.com.gaitkoski.portal.repository.NoticiaRepository;

@Component
public class DataBaseInsert implements CommandLineRunner {
    
    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    NoticiaRepository noticiaRepository;

    public void run(String... args) throws Exception {

        Categoria c1 = new Categoria("Teste1", "Nome Categoria", null, true);
        categoriaRepository.save(c1);

        Noticia n1 = new Noticia("Titulo noticia", "corpo noticia", LocalDateTime.now(), 
        "https://picsum.photos/id/200/1920/1280", c1);
        noticiaRepository.save(n1);

        
    }
}