//Написать программу на Java для вычисления серии чисел Фибоначчи.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 1, number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество значени");
        number = scan.nextInt();
        System.out.println("Серия чисел Фибоначчи: ");
        for (int i = 0; i <= number; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(x +"");
        }

    }
}
