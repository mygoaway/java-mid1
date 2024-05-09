package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // 1. 쌍따옴표 사용
        String str1 = "hello";

        // 2. 객체 생성
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 문자열은 매우 자주 사용한다. 그래서 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 new String("hello")와 같이 변경해준다.
        // 이 경우, 실제로는 성능 최적화를 위해 문자열 풀을 사용한다.
        // String str3 = "hello";(기존) -> String str4 = new String("Hello"); (변경)
    }
}
