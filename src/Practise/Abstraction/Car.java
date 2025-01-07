package Practise.Abstraction;

public interface Car {
    default void say(String name) {
        System.out.println("Hello " + name);
    }

    void sayMore();
}
