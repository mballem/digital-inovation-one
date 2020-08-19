package one.innovation.demorestfull.controller;

import one.innovation.demorestfull.dto.Soldado;
import one.innovation.demorestfull.service.SoldadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable String cpf) {
        Soldado soldado = soldadoService.buscarSoldado(cpf);
        return ResponseEntity.ok(soldado);
    }

    @PostMapping
    public ResponseEntity<Void> criarSoldado(@RequestBody Soldado soldado) {
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{cpf}")
    public ResponseEntity<Void> editarSoldado(@PathVariable String cpf,
                                              @RequestBody Soldado soldado) {
        soldadoService.alterarSoldado(cpf, soldado);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarSoldado(@PathVariable String cpf) {
        soldadoService.excluirSoldado(cpf);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Soldado>> buscarSoldados() {
        List<Soldado> soldados = soldadoService.buscarTodos();
        return ResponseEntity.ok(soldados);
    }
}
