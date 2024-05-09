package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교:" + (str1 == str2));        // false (동일성)
        System.out.println("new String() equals 비교:" + str1.equals(str2)); // true (동등성)

        // 문자열 리터럴 => 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다. [메서드 영역 내 문자열 풀]
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교:" + (str3 == str4));        // true (동일성)
        System.out.println("리터럴 equals 비교:" + str3.equals(str4)); // true (동등성)


    }
}
