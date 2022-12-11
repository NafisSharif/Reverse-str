public class deleteEmpty {
    public static void main(String[] args) {
        String st1 = "Мы любим    кодить    на языке    Java";

        String st2 = st1.replaceAll("\\s", "");

        System.out.println(st2);

    }
}
