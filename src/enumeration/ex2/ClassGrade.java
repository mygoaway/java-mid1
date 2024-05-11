package enumeration.ex2;

public class ClassGrade {
    // 타입 안전 열거형 패턴 => 타입 안전성 향상, 데이터 일관성
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 단점
    // 상수 정의와 같이 많은 코드르 작성해야 하며, private 생성자를 추가하는 등 별도의 작업이 필요

    // private 생성자 추가 => 다른 클래스에서 생성이 불가
    private ClassGrade() {}
}
