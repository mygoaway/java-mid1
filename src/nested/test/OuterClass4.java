package nested.test;

public class OuterClass4 {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {

            }
        };
        hello.hello();
    }
}
