package Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 4);
        cats[2] = new Cat("Феликс", 5);
        cats[3] = new Cat("Мяут", 6);
        cats[4] = new Cat("Хома", 3);
        Plate plate = new Plate(20);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
        for (int i = 0; i <cats.length ; i++) {
            cats[i].sat();
        }
        plate.appFood();

    }

}
