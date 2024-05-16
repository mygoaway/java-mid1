package nested.local;

public class LocalOuterV2 {
    private int outInstanceValue = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 선언
        class LocalPrinter implements Printer{
            int value = 0;

             public void print() {
                 System.out.println("value = " + value);
                 System.out.println("localVar = " + localVar);
                 System.out.println("paramVar = " + paramVar);
                 System.out.println("outInstanceValue = " + outInstanceValue);
             }
        }

        // 생성
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
