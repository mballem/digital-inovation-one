package map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {
        System.out.println("Crie um MAP de carros e consumos");
        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("HB20", 14.5);
        carros.put("Kwid", 15.6);
        System.out.println(carros);

        System.out.println("Substitua o consumo do Gol por 15.2 km/l");
        carros.put("Gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo Tuckson está armazenado: " + carros.containsKey("Tuckson"));
        System.out.println("Confira se o modelo Uno está armazenado: " + carros.containsKey("Uno"));

        System.out.println("Exiba o consumo do Uno: " + carros.get("Uno"));

        System.out.println("Exiba os modelos: " + carros.keySet());
        System.out.println("Exiba os consumos: " + carros.values());

        System.out.print("Exiba o modelo de maior consumo: ");
        Double consumo = Collections.max(carros.values());
        for (Map.Entry<String, Double> kv : carros.entrySet()) {
            if (kv.getValue().equals(consumo)) {
                System.out.println(kv.getKey() + " - " + kv.getValue() + "\n");
            }
        }

        System.out.print("Exiba o modelo de menor consumo: ");
        consumo = Collections.min(carros.values());
        for (Map.Entry<String, Double> kv : carros.entrySet()) {
            if (kv.getValue().equals(consumo)) {
                System.out.println(kv.getKey() + " - " + kv.getValue() +"\n");
            }
        }

        System.out.print("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média de consumo: " + soma / carros.size());

        System.out.println(carros);
        System.out.println("Remova os modelos com consumo igual a 15.6");
        iterator = carros.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(15.6)) {
                iterator.remove();
            }
        }
        System.out.println(carros);

        System.out.println("Exiba os carros na ordem de inserção");
        carros = new LinkedHashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("HB20", 14.5);
        carros.put("Kwid", 15.6);
        System.out.println(carros);

        System.out.println("Limpe o map de carros");
        carros.clear();
        System.out.println("Exiba se o map está vazio: " + (carros.isEmpty() ? "SIM" : "NAO"));
    }
}
