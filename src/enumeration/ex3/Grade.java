package enumeration.ex3;

public enum Grade {
    // 열거형도 클래스이다.
    // 열거형은 자동으로 java.lang.Enum을 상속받는다
    // 외부에서 임의로 생성할 수 없다. = new Grade() 컴파일 에러 발생
    // toString() 오버라이딩 되어 있음
    BASIC, GOLD, DIAMOND
}
