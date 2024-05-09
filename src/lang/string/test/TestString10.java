package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String original = "apple,banana,mango";

        // 분리하기
        String[] strArr = original.split(",");
        for (String s : strArr) {
            System.out.println(s);
        }

        // 조인하기
        String result = String.join("->", strArr);

        System.out.println("result = " + result);
    }
}
