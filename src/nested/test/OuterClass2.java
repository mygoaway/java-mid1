package nested.test;

public class OuterClass2 {
    // 내부 클래스
    class InnerClass {
        public void hello() {

        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
