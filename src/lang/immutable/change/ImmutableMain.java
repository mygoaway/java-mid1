package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj addImmutableObj = immutableObj.add(20);

        // 계산 이후의 값은 사라짐
        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("addImmutableObj = " + addImmutableObj.getValue());
    }
}
