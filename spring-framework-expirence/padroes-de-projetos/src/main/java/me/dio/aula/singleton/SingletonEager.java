package me.dio.aula.singleton;

/**
 * Singleton "apressado".
 */
public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
