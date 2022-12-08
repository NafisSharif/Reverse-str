//Напишите программу на Java для переворота последовательности
// символов в строке без использования встроенной в String функции reverse().

public class reverseWihtoutF {
    public static void main(String[] args) {
        String st = "Задача1";
        char symbols[] = st.toCharArray(); // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке

        for (int i = symbols.length - 1; i >= 0; i--) {
            System.out.print(symbols[i]);
        }
    }
}
