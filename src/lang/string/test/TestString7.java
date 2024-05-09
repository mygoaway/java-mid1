package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "     Hello Java   ";
        String result1 = original.trim();
        System.out.println("result = " + result1);

        String result2 = original.strip();
        System.out.println("result2 = " + result2);

    }
}
