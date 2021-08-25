package org.example.no;

public class MainNo {
    public static void main(String[] args) {
        No n1 = new No("Nó 1");

        No n2 = new No("Nó 2");

        n1.setProximo(n2);

        No n3 = new No("Nó 3");
        n2.setProximo(n3);

        No n4 = new No("Nó 4");
        n3.setProximo(n4);

        System.out.println(n1);
        System.out.println(n1.getProximo());

        System.out.println("--- --- --- --- ---");

        //n1 > n2 > n3 > n4 > null
        System.out.println(n1);
        System.out.println(n1.getProximo());
        System.out.println(n1.getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo().getProximo());

    }
}
