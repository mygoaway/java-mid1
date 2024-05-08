package lang.object.toString;

public class ObjectPrinter {
    // 추상적인 Object 클래스에 의존
    public static void print(Object object) {
        String s = "객체 정보 출력:" + object.toString();
        System.out.println(s);
    }
}
