package lang.string.channing;

public class MethodChanningMain3 {
    public static void main(String[] args) {
        // StringBuilder의 append() 메서드를 보면 자기 자신의 참조값을 반환한다.
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

    }
}
