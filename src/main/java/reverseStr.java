//Напишите программу на Java для переворачивания строки,
// изменив расположение символов в строке задом наперёд
// без использования встроенных в String функций.

public class reverseStr {
    public static void main(String[] args) {
        String st = "Задача1";
        StringBuffer stp = new StringBuffer(st);
        System.out.println(stp.reverse());

    }

}
