import com.sun.deploy.security.SelectableSecurityManager;

public class Lesson2 {
    public static void main(String[] args) {

        // Задача 1

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задача 1: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Задача 2

        int[] arr2 = new int[8];
        int j = 0;
        System.out.println("Задача 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = j;
            System.out.print(arr2[i] + " ");
            j = j + 3;
        }
        System.out.println();

        //Задача 3

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задача 3:");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        // Задача 4

        int[][] arr4 = new int[4][4];
        System.out.println("Задача 4");
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
            for (int k = 0; k < arr4.length; k++) {
                System.out.print(arr4[i][k] + " ");
            }
            System.out.println();
        }

        // Задача 5

        int[] arr5 = {8, 5, -9, 2, 11, 4, 5, 2, 20, 8, 9, 1};
        System.out.println("Задача 5:");
        int maxN = arr5[0];
        int minN = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > maxN) {
                maxN = arr5[i];
            }
            if (arr5[i] < minN) {
                minN = arr5[i];
            }
        }
        System.out.println("Max= " + maxN);
        System.out.println("Min= " + minN);


        // Задача 6

        int[] arr6 = {2, 4, 1, 2, 3};
        System.out.println("Задача 6");
        System.out.println(checkBalance(arr6));
    }

    public static boolean checkBalance(int[] arr6) {
        int s1 = arr6[0];
        int s2 = 0;
        for (int i = 1; i < arr6.length; i++) {
            s2 += arr6[i];
        }
        if (s1 == s2) {
            return true;
        }
        for (int i = 1; i < arr6.length; i++) {
            s1 += arr6[i];
            s2 -= arr6[i];
            if (s1 == s2) {
                return true;
            }
        }
        return false;
    }

}