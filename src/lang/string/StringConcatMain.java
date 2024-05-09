package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b); // 자바에서 문자열을 더 할 때는 String이 제공하는 concat() 메서드를 사용할 수 있다.
        String result2 = a + b; // 문자열은 자주 다루어지기 때문에 자바 언어에서 편의상 특별히 + 연산을 제공한다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
