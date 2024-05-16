package nested.test;

public class OuterClass1 {
    // 정적 클래스
    static class NestedClass {
        public void hello() {

        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
