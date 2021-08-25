package org.example.no;

public class MainNoGenerico {
    public static void main(String[] args) {
        NoGenerico<String> n1 = new NoGenerico<>("Nó 1");

        NoGenerico<String> n2 = new NoGenerico<>("Nó 2");

        n1.setProximo(n2);

        NoGenerico<String> n3 = new NoGenerico<>("Nó 3");
        n2.setProximo(n3);

        NoGenerico<String> n4 = new NoGenerico<>("Nó 4");
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
