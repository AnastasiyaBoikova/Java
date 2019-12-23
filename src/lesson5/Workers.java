package lesson5;

public class Workers {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Иванов Иван", "Инжинер", "ivanov43@mail.ru",
                "89096655439", 50000, 45);
        persArray[1] = new Employee("Петров Петр", "Слесарь", "petrov77@mail.ru",
                "89197766443", 40000, 43);
        persArray[2] = new Employee("Смирнов Олег", "Инжинер", "smirnov@mail.ru",
                "89090989065", 50000, 47);
        persArray[3] = new Employee("Букин Евгений", "Столер", "dukin99@mail.ru",
                "89661121211", 32000, 35);
        persArray[4] = new Employee("Носкова Ирина", "Бухгалтер", "smirnov@mail.ru",
                "89095565437", 37000, 32);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].age > 40) {
                persArray[i].info();
            }
        }
    }
}



