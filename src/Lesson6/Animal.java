package Lesson6;

public class Animal {
    String name;
    int r;
    int s;
    int j;

    void run(int r) {
        System.out.println(name + " бежит " + r + " м");
    }

    void swim(int s) {
        System.out.println(name + " плывет " + s + " м");
    }

    void jump(int j) {
        System.out.println(name + " прыгает " + j + " м");
    }
}
