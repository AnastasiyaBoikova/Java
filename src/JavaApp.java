import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class JavaApp {
    public static void main(String[] args) {
        // Задача 2
        byte a2 = -100;
        short b2 = 22222;
        int c2 = 1111111111;
        long d2 = 20000000000L;
        float f2 = 10.33f;
        double g2 = 222.222;
        boolean h2 = false;
        char k2 = '+';

        // Задача 3
        float a3, b3, c3, d3;
        a3 = b3 = c3 = d3 = 10.2f;
        float r3 = task3(a3, b3, c3, d3);
        System.out.println("Задача 3: " + r3);

        //  Задача 4

        int a4, b4;
        a4 = 4;
        b4 = 5;
        boolean r4 = task4(a4, b4);
        System.out.println("Задача 4: " + r4);

        // Задача 5

        int a5 = 8;
        System.out.println("Задача 5: a5=" + a5);
        task5(a5);

        // Задача 6

        int a6 = -6;
        boolean r6 = task6(a6);
        System.out.println("Задача 6: " + r6);

        // Задача 7

        String name = "Маша";
        System.out.println("Задача 7:");
        task7(name);

        // Задача 8

        int year = 1986;
        System.out.println("Задача 8:");
        task8(year);
        task8(2000);
        task8(2001);
        task8(2012);
        task8(2020);
        task8(2016);
        task8(2024);
    }


    public static float task3(float a, float b, float c, float d) {
        float h;
        h = a * (b + (c / d));
        return h;
    }

    public static boolean task4(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void task5(int a) {

        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean task6(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void task7(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task8(int year) {
        if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0)) {
            System.out.println(year + ": Год високосный");
        } else {

            System.out.println(year + ": Год невисокосный");
        }

    }
}