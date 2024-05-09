package lang.wrapper;

import lang.object.poly.Dog;

public class WrapperClassMain {
    public static void main(String[] args) {
        // 래퍼 클래스는 불변이다. 그리고 equals로 비교해야 한다.
        // toString() 오버라이딩 되어 있음
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변(성능 최적화)
        Long longObj = Long.valueOf(10);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        double doubleValue = doubleObj.doubleValue();
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));

        // 래퍼 클래스 생성
        // - 박싱 : int -> Integer
        // - 언박싱 : Integer -> int
        // - 비교는 eqauls() 사용
        // 래퍼 클래스는 문자로 출력하도록 toString() 오버라아딩 되어 있음
    }
}
