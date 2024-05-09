package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        // 문자열 리터럴 => 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다. [메서드 영역 내 문자열 풀]
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교1: " + isSame(str3, str4));
    }

    // isSame()의 경우 매개변수로 넘어오는 String 인스턴스가 new String()으로 만든것인지, 문자열 리터럴로 만들어진것이 확인이 불가하다.
    // 그래서 무조건 문자열은 eqauls() 메서드를 활용해서 비교하자.
    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
