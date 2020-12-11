package com.jonathanferreira.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jonathanferreira.portfolio.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> { //busca lista de postagem atraves do titulo ignorando maiusc e min
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
	public List<Postagem> findByTextoContainingIgnoreCase (String texto);
}
