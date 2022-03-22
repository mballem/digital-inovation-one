package me.dio.tunitarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Pessoa {

    private String nome;

    private LocalDate nascimento;

    private String[] hobbies;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, LocalDate nascimento, String... hobbies) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.hobbies = hobbies;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
    }

    public boolean isMaiorIdade() {
        return getIdade() >= 18;
    }

    public String[] getHobbies() {
        return this.hobbies;
    }

    public int totalDeHobbies() {
        return this.hobbies.length;
    }

    public String getHobby(String hobby) {
        return Arrays.stream(this.hobbies).filter(h -> h.equals(hobby)).collect(Collectors.joining());
    }
}
