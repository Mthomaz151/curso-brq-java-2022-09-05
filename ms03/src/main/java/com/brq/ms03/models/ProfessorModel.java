package com.brq.ms03.models;

import com.brq.ms03.dtos.ProfessorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "professores")
public class ProfessorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profes")
    private int id;

    @Column(name = "nome_profes")
    private String nome;

    @Column(name = "cpf_profes")
    private String cpf;

    @Column(name = "salario_profes")
    private String salario;

    @Column(name = "telefone_profes")
    private String telefone;


    public ProfessorDTO toDTO(){
        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, ProfessorDTO.class);
    }
}