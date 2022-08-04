package me.dio.aula.singleton;

/**
 * Testes relacionados aos Padrões de Projetos Singleton
 */
public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println("Lazy: " + singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println("Lazy: " + singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println("Eager: " + singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println("Eager: " + singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Holder: " + singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Holder: " + singletonLazyHolder);
    }
}
