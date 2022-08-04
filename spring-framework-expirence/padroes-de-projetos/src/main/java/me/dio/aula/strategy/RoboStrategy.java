package me.dio.aula.strategy;

public class RoboStrategy {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        this.comportamento.mover();
    }
}
