package br.com.gaitkoski.portal.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "noticia")
@Data
@NoArgsConstructor
public class Noticia {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "corpo")
    private String corpo;

    @Column(name = "data_publicacao")
    private LocalDateTime dataPublicacao;

    @Column(name = "imagem_url")
    private String imagem_url;

    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    @ManyToOne
    private Categoria categoria;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuario;  

    public Noticia(String titulo, String corpo, LocalDateTime dataPublicacao, String imagem_url, Categoria categoria){
        this.titulo = titulo;
        this.corpo = corpo;
        this.dataPublicacao = dataPublicacao;
        this.imagem_url = imagem_url;
        this.categoria = categoria;
    }

}
