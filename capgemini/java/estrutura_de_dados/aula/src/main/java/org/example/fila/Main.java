package org.example.fila;

public class Main {
    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new Elemento("primeiro"));
        minhaFila.enqueue(new Elemento("segundo"));
        minhaFila.enqueue(new Elemento("terceiro"));
        minhaFila.enqueue(new Elemento("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new Elemento("ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);
    }
}
