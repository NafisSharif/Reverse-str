//Напишите программу на Java, чтобы поменять
// местами значения, хранящиеся в двух переменных,
// без использования третьей переменной.

import java.util.Scanner;

public class changeABwithoutC {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Введите значения а и b");
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Введенные значения a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Рельзультат а = " + a + " b " + b);

    }
}
