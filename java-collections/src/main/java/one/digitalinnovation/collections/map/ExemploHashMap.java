package one.digitalinnovation.collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        // não é do tipo java.util.Collection
        // permite valores repetidos mas não chaves repetidas
        Map<String, Integer> campeoesFifa = new HashMap<>();
        campeoesFifa.put("Brasil", 0);
        campeoesFifa.put("Alemanha", 4);
        campeoesFifa.put("Italia", 4);
        campeoesFifa.put("Uruguai", 2);
        campeoesFifa.put("Argentina", 2);
        campeoesFifa.put("França", 2);
        campeoesFifa.put("Inglaterra", 1);
        campeoesFifa.put("Espanha", 1);

        System.out.println(campeoesFifa);

        // Atualiza o valor para uma determinada chave
        campeoesFifa.put("Brasil", 5);

        System.out.println(campeoesFifa);

        // Retorna o valor para uma determinada chave
        System.out.println(campeoesFifa.get("Argentina"));

        // Retorna se existe o valor para uma determinada chave
        System.out.println(campeoesFifa.containsKey("Holanda"));

        // Remove e retorna o valor do map pela chave em questão
        System.out.println(campeoesFifa.remove("França"));

        System.out.println(campeoesFifa);

        // Retorna se existe algum elemento com um determinado valor
        System.out.println(campeoesFifa.containsValue(1));

        // Retorna o total de elementos no map
        System.out.println(campeoesFifa.size());

        // Percorre o Map e recupera a chave e valor de cada elemento
        for (Map.Entry<String, Integer> entry : campeoesFifa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Percorre o Map e recupera apenas a chave
        for (String key : campeoesFifa.keySet()) {
            System.out.println("Key: " + key);
            // com a chave podemos recuperar o valor via get no map
            System.out.println("Value: " + campeoesFifa.get(key));
        }
    }
}
