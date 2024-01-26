package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Created Singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
