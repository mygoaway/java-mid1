package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // 지역 클래스
        class LocalClass {
            public void hello() {

            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.myMethod();
    }
}
