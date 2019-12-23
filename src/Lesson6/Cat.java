package Lesson6;

import sun.security.ssl.HandshakeInStream;

public class Cat extends Animal {
    int rMax;
    int jMax;

    public Cat(String name, int rMax, int jMax) {
        this.name = name;
        this.jMax = jMax;
        this.rMax = rMax;
    }

    @Override
    void swim(int s) {
        System.out.println("Коты не умеют плавать");
    }

    void run(int r) {
        if (r <= rMax) {
            super.run(r);
        } else {
            System.out.println("Кот не может столько пробежать");
        }
    }

    void jump(int j) {
        if (j <= jMax) {
            super.jump(j);
        } else {
            System.out.println("Кот не может столько прыгнуть");
        }
    }
}
