package com.brq.ms03.controllers;

import com.brq.ms03.dtos.ProfessorDTO;
import com.brq.ms03.models.ProfessorModel;
import com.brq.ms03.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ProfessorController {

    @Autowired
    private ProfessorService profService;

    @GetMapping("professores")
    public List<ProfessorDTO> getAllProfessor(){

        profService.mostrarMensagemService();

        return profService.getAllProfessores();
    }

    @PostMapping("professores")
    public ProfessorDTO create(@Valid @RequestBody ProfessorDTO professor){

        var t = profService.create(professor);

        return t;

    } // create

}
