package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Tarefa1 {

    public static void main(String[] args) {
        List<Temperatura> temperaturas = Arrays.asList(
                new Temperatura("Janeiro", 29.5),
                new Temperatura("Fevereiro", 27.2),
                new Temperatura("Março", 22.4),
                new Temperatura("Abril", 19.8),
                new Temperatura("Maio", 16.3),
                new Temperatura("Junho", 12.4)
        );

        System.out.printf("A média de temperatura no 1º semestre foi %.2fºC: \n", mediaSemestral(temperaturas));

        System.out.print("Os meses acima da média foram: ");
        exibirMesesAcimaDaMedia(temperaturas);
    }

    static void exibirMesesAcimaDaMedia(List<Temperatura> temperaturas) {
        Double media = mediaSemestral(temperaturas);
        for (Temperatura t : temperaturas) {
            if (t.getGraus() > media) {
                System.out.print(" " + t.getMes());
            }
        }
        System.out.println("");
    }

    static Double mediaSemestral(List<Temperatura> temperaturas) {
        Double soma = 0.0;
        Iterator<Temperatura> iterator = temperaturas.iterator();
        while (iterator.hasNext()) {
            Double temp = iterator.next().getGraus();
            soma += temp;
        }
        return soma / temperaturas.size();
    }
}

class Temperatura {

    private String mes;
    private Double graus;

    public Temperatura(String mes, Double graus) {
        this.mes = mes;
        this.graus = graus;
    }

    public String getMes() {
        return mes;
    }

    public Double getGraus() {
        return graus;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", graus=" + graus +
                '}';
    }
}
