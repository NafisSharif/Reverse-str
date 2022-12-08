//Напишите программу на Java для того,
// чтобы поменять местами значения, хранящиеся
// в двух переменных с помощью третьей переменной

import java.util.Scanner;

public class ChangeAB {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите значения a и b");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Пока что значение a = "+ a + " b = "+b);
        c = a;
        a = b;
        b = c;

        System.out.println("Результат a = " + a + " b = "+ b);
    }
}
