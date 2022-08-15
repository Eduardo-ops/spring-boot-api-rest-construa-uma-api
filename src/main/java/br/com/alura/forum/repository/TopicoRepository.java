package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);

    //Utilizado quando prefere-se criar o método com um nome próprio, assim, deve-se criar a query manualmente.
    @Query("SELECT t from Topico t WHERE t.curso.nome = :nomeCurso")
    List<Topico> carregaPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
