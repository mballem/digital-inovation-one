package one.innovation.demorestfull.dto;

public class Soldado {
    private String cpf;
    private String nome;
    private String raca;
    private String arma;

    public Soldado(String cpf, String nome, String raca, String arma) {
        this.cpf = cpf;
        this.nome = nome;
        this.raca = raca;
        this.arma = arma;
    }

    public Soldado() {
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
