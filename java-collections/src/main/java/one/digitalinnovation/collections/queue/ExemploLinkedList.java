package one.digitalinnovation.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        // Queue - conceito de fila, primeiro que entra é o primeiro que sai (FIFO)
        Queue<String> fila = new LinkedList<>();
        fila.add("Patricia");
        fila.add("Roberto");
        fila.add("Flávio");
        fila.add("Pamela");
        fila.add("Anderson");

        System.out.println(fila);

        // poll - retorna e remove o primeiro elemento da fila, retorna null caso esteja vazia
        // peek - retorna mas não remove o primeiro elemento da fila, retorna null caso esteja vazia
        // element - idem ao poll, mas retorna uma exceção 'NoSuchElementException' caso esteja vazia
        String clienteASerAtendido = fila.poll();

        System.out.println(fila);

        System.out.println(clienteASerAtendido);

        String primeiroCliente = fila.peek();

        System.out.println(fila);

        System.out.println(primeiroCliente);

        System.out.println(fila);

        try {
            String primeiroClienteOuErro = fila.element();

            System.out.println("1 : " + primeiroClienteOuErro);

            fila.clear();

            primeiroClienteOuErro = fila.element();

            System.out.println("2 : " + primeiroClienteOuErro);

        } catch (NoSuchElementException ex) {

            System.out.println("Fila vazia, nenhuma cliente retornado: " + ex.getMessage());
        }

        fila = new LinkedList<>();
        fila.add("A1");
        fila.add("A2");
        fila.add("A3");
        fila.add("A4");
        fila.add("A5");

        System.out.println(fila);

        // offer - adiciona um novo elemento ao final da fila
        fila.offer("A6");

        System.out.println(fila);

        System.out.println(" ------------ LinkedList ----------- ");

        LinkedList<String> sequencia = new LinkedList<>();
        sequencia.add("B1");
        sequencia.add("B2");
        sequencia.add("B3");
        sequencia.add("B4");
        sequencia.add("B5");

        System.out.println(sequencia);

        // adiciona um novo elemento ao inicio da fila (Método da classe LinkedList)
        sequencia.addFirst("B0");

        System.out.println(sequencia);

        // adiciona um novo elemento ao final da fila (Método da classe LinkedList)
        sequencia.addLast("B6");

        System.out.println(sequencia);

        // substitui o elemento existente por um novo na posição indicada pelo indice
        sequencia.set(5, "Bx");

        System.out.println(sequencia);

        // percore a fila do final para o inicio
        Iterator<String> iterator = sequencia.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
