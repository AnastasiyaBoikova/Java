package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiet;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiet = p.decreaseFood(appetite);
    }

    public void sat() {
        System.out.println(name + " " + (satiet ? "сыт" : "голоден"));
   }
}
