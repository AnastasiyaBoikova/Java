package Lesson7;

public class Plate {
    private int food;
    private int food1;
    public Plate(int food) {
        this.food = food;
        food1 = food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            System.out.println("Кот поел");
        } else {
            System.out.println("Кот не поел");

        }
        return food >= n;
    }

    public void appFood() {
            food += food1 ;
        System.out.println("Добавили в тарелку " + food1 + " еды");
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }
}
