package lesson5;

public class Employee {
     String name;
     String position;
     String email;
     String phone;
     float salary;
     int age;


    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Сотрудник: " + name + " Должность: " + position + " email: " + email + " Телефон: "
                + phone + " Зарплата: " + salary + " Возраст " + age);
    }
}