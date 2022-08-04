package me.dio.academia.digital.controller;

import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.service.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @ApiOperation(
            value = "Insere um avaliação fisica",
            response = AvaliacaoFisica.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @ApiOperation(
            value = "Retorna uma coleção com as Avaliacões Fisicas",
            response = AvaliacaoFisica[].class)
    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @ApiOperation(
            value = "Altera a avaliação fisica correspondente ao id informado",
            notes = "Os campos peso, altura e data da avaliação podem ser alterados separadamente",
            response = Aluno[].class)
    @PatchMapping("/{id}")
    public AvaliacaoFisica update(@Valid @RequestBody AvaliacaoFisicaUpdateForm form, @PathVariable("id") Long id) {

        return service.update(id, form);
    }
}
