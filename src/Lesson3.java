import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String args[]) {
        boolean play = true;
        Random number = new Random();
        Scanner in = new Scanner(System.in);
        while (play) {
            int n = number.nextInt(9);
            play = guessNumber(n, in);
        }
        System.out.println("Спасибо за игру!");
        in.close();
    }

    public static boolean guessNumber(int n, Scanner in) {
        System.out.println("Угадайте число от 0 до 9 за три попытки.");
        int a = 0;
        for (int i = 0; i < 3; i++) {
            a = in.nextInt();
            if (a == n) break;

            System.out.println((a > n) ? "Загаданное число меньше" : "Загаданное число больше");
        }
        System.out.println(a == n ? "Вы выйграли." : "Вы проиграли.");
        System.out.println("Повторить игру еще раз? 1 - да/ 2 - нет");
        int s = in.nextInt();
        return s == 1;
    }
}

