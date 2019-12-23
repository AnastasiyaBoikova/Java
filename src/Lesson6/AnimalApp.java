package Lesson6;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 40, 1);
        Cat cat2 = new Cat("Мурзик", 25, 2);
        Dog dog1 = new Dog("Рекс", 15, 500, 3);
        Dog dog2 = new Dog("Туз", 5, 350, 2);
        cat1.run(30);
        cat1.jump(1);
        cat2.swim(2);
        cat2.run(3);
        cat2.jump(2);
        dog1.run(150);
        dog1.jump(1);
        dog2.swim(4);
    }
}
