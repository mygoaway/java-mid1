package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // Printer 인터페이스를 구현한 익명 클래스 생성 및 선언
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        };

        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
