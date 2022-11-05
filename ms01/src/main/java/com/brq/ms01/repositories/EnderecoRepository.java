package com.brq.ms01.repositories;

import com.brq.ms01.models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * O primeiro argumento do JpaRepository é a classe modelo para mapear uma tabela
 * e a classe Java
 *
 * O segundo argumento é o tipo de dado da chave primária
 * */
@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Integer> {
}