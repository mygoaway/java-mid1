package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // 오토 박싱/언박싱 도입 => 컴파일 단계에서 valueOf() / xxxValue 추가해줌
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
