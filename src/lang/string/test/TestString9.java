package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String original = "hello@example.com";
        String[] strArr = original.split("@");

        System.out.println("ID: " + strArr[0]);
        System.out.println("Domain: " + strArr[1]);
    }
}
