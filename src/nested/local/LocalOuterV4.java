package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceValue = 3;


    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 영역이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer{
            int value = 0;

             public void print() {
                 System.out.println("value = " + value);

                 // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                 System.out.println("localVar = " + localVar);
                 System.out.println("paramVar = " + paramVar);
                 System.out.println("outInstanceValue = " + outInstanceValue);
             }
        }

        LocalPrinter localPrinter = new LocalPrinter(); // LocalPrinter 인스턴스를 생성하는 시점에 지역 변수인 localVar, paramVar를 캡쳐한다
        // 만약 localVar의 값을 변경한다면? 다시 캡쳐해야 하나?
        // 자바는 캡쳐한 지역 변수의 값을 변하지 못하게 막아서 복잡한 문제들을 근본적으로 차단한다
        // 결론적으로 지역 변수는 변경하면 안된다. => 지역 변수는 사실상 final
        //localVar = 10;
        //paramVar = 20;

        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 outer = new LocalOuterV4();
        Printer printer = outer.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
        //declaredField = int nested.local.LocalOuterV3$1LocalPrinter.value
        //declaredField = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
        //declaredField = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
        //declaredField = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0 // 바깥 클래스 참조
    }
}
