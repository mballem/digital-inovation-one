package me.dio.academia.digital.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @ApiOperation(
            value = "Insere um Aluno",
            response = Aluno.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @ApiOperation(
            value = "Retorna uma de AvaliacaoFisica pelo id do aluno",
            response = AvaliacaoFisica[].class)
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @ApiOperation(
            value = "Retorna uma coleção de Alunos pela data de nascimento",
            response = Aluno[].class)
    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                              String dataDeNacimento) {
        return service.getAll(dataDeNacimento);
    }

    @ApiOperation(
            value = "Retorna um aluno pelo seu id",
            response = Aluno.class)
    @GetMapping("/{id}")
    public Aluno getOne(@PathVariable("id") Long id) {

        return service.get(id);
    }

    @ApiOperation(
            value = "Edita os campos de um aluno pelo id",
            notes = "Os campos nome, bairro e data de nascimento pode ser alterados separadamente pelo id do aluno",
            response = Aluno.class)
    @PatchMapping("/{id}")
    public Aluno update(@Valid @RequestBody AlunoUpdateForm form, @PathVariable("id") Long id) {
        return service.update(id, form);
    }

    @ApiOperation(
            value = "Excluí um aluno pelo id",
            response = Void.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
