package me.dio.academia.digital.controller;

import io.swagger.annotations.ApiOperation;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;

  @ApiOperation(
          value = "Cria uma matriculo com o id do aluno",
          response = Matricula.class)
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping
  public Matricula create(@Valid @RequestBody MatriculaForm form) {
    return service.create(form);
  }

  @ApiOperation(
          value = "Retorna uma coleção de matriculas",
          notes = "Com o uso do parametro bairro todas matriculas referentes são retornadas. Sem" +
                  " o parametro bairro todas as matriculas existentes serão retornadas",
          response = Matricula[].class)
  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return service.getAll(bairro);
  }

}

