package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.exception.EntityNotExistsException;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EntityNotExistsException("Aluno com id = " + id + " não encontrado!"));
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {

        if (dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = get(id);

        if (formUpdate.getNome() != null)
            aluno.setNome(formUpdate.getNome());

        if (formUpdate.getBairro() != null)
            aluno.setBairro(formUpdate.getBairro());

        if (formUpdate.getDataDeNascimento() != null)
            aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());

        return aluno;
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();

    }

}
