import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    static char map[][];
    static int size = 5;
    static int dots_to_win = 4;
    static char dot_empty = '.';
    static char dot_X = 'X';
    static char dot_O = 'O';
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkwin(dot_X)) {
                System.out.println("Вы выйграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkwin(dot_O)) {
                System.out.println("Выйграл компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена.");
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println("'X'");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("'Y'");
    }

    public static void humanTurn() {
        int X, Y;
        do {
            System.out.println("Игрок 1: Введите координты в формате 'Х' 'Y'");
            X = sc.nextInt() - 1;
            Y = sc.nextInt() - 1;
        }
        while (!isCellValid(X, Y));
        map[Y][X] = dot_X;

    }

    public static void aiTurn() {
        int X, Y;
        do {
            System.out.println("Ход компьютера");
            X = rnd.nextInt(4);
            Y = rnd.nextInt(4);
        }
        while (!isCellValid(X, Y));
        map[Y][X] = dot_O;
    }

    public static boolean isCellValid(int X, int Y) {
        if (X < 0 || X >= size || Y < 0 || Y >= size)
            return false;
        if (map[Y][X] == dot_empty)
            return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dot_empty) return false;
            }
        }
        return true;
    }

    private static boolean checkwin(char c) {
        int s1 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s1 = map[i][j] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
            }
        }

        for (int j = 0; j < size; j++) {
            s1 = 0;
            for (int i = 0; i < size; i++) {
                s1 = map[i][j] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
            }
        }

        for (int i = 0; i < size; i++) {
            s1 = 0;
            int x = 0;
            int y = i;
            while (x < size && y < size) {
                s1 = map[x][y] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
                x++;
                y++;
            }
        }

        for (int i = 0; i < size; i++) {
            s1 = 0;
            int x = i;
            int y = 0;
            while (x < size && y < size) {
                s1 = map[x][y] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
                x++;
                y++;
            }
        }

        for (int i = 0; i < size; i++) {
            s1 = 0;
            int x = 0;
            int y = i;
            while (x < size && y >= 0) {
                s1 = map[x][y] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
                x++;
                y--;
            }
        }

        for (int i = 0; i < size; i++) {
            s1 = 0;
            int x = i;
            int y = size - 1;
            while (x < size && y >= 0) {
                s1 = map[x][y] == c ? s1 + 1 : 0;
                if (s1 == dots_to_win) return true;
                x++;
                y--;
            }
        }
        return false;
    }
}

