package me.dio.academia.digital.entity.form;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AvaliacaoFisicaUpdateForm {

  private double peso;

  private double altura;

  private LocalDateTime dataDaAvaliacao;
}
