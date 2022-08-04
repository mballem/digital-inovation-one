package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /**
     * @param bairro bairro referência para o filtro
     * @return lista de alunos matriculados que residem no bairro passado como parâmetro
     */
    List<Matricula> findMatriculasByAlunoBairro(String bairro);

}
