package org.example.pilha;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // adiciona elementos na pilha 'LIFO'
        pilha.push(new Elemento(1));
        pilha.push(new Elemento(2));
        pilha.push(new Elemento(3));
        pilha.push(new Elemento(4));
        pilha.push(new Elemento(5));
        pilha.push(new Elemento(6));
        System.out.println(pilha);

        // remove o último elemento da pilha
        System.out.println("ùltimo elemento: " + pilha.last());
        pilha.pop();
        System.out.println(pilha);
        System.out.println("ùltimo elemento: " + pilha.last());

        // adiciona novo elemento a pilha
        pilha.push(new Elemento(7));
        System.out.println(pilha);

        System.out.println("primeiro elemento: " + pilha.first());
    }
}
