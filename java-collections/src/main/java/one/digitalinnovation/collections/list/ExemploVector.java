package one.digitalinnovation.collections.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        // altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        // Remove o esporte da posição
        esportes.remove(3);

        // Remove o esporte Handebol do vetor
        esportes.remove("Handebol");

        // retorna o elemento de indice 0 do vetor
        System.out.println(esportes.get(0));

        for (String esporte : esportes) {
            System.out.println(esporte);
        }


    }
}
