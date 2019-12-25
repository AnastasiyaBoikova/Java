package Lesson6;

public class Dog extends Animal {
    int rMax;
    int sMax;
    float jMax;

    public Dog(String name, int sMax, int rMax, int jMax) {
        this.name = name;
        this.sMax = sMax;
        this.jMax = jMax;
        this.rMax = rMax;
    }

    void run(int r) {
        if (r <= rMax) {
            super.run(r);
        } else {
            System.out.println("Собака не может столько пробежать");
        }
    }

    void jump(int j) {
        if (j <= jMax) {
            super.jump(j);
        } else {
            System.out.println("Собака не может столько прыгнуть");
        }
    }

    void swim(int s) {
        if (s <= sMax) {
            super.swim(s);
        } else {
            System.out.println("Собака не может столько проплыть");
        }
    }
}
