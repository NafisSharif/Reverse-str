//Напишите Java-программу, чтобы определить,
// является ли строка или число палиндромом, или нет.

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        String inputString, reversedString = "";
        int stringLength;

        System.out.println("Введите число или строку");
        Scanner scan = new Scanner(System.in);
        inputString = scan.nextLine();

        stringLength = inputString.length();
        for (int i = stringLength-1; i >= 0; i--) {
            reversedString = reversedString + inputString.charAt(i);
        }

        if (inputString.equals(reversedString))
            System.out.println("Число или строка является палиндромом");
        else
            System.out.println("Число или строка не является палиндромом");

    }
}
