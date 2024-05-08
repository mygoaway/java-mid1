package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        System.out.println(child.toString());

        // 자바에서 Object 클래스가 최상위 부모 클래스인 이유
        // 1. 공통 기능 제공 : 객체의 정보를 제공하는 toString(), 같음을 비교하는 equals(), 클래스 정보 제공하는 getClass() 등등..
        // 2. 다형성의 기본 구현 : Object 클래스는 모든 객체를 참조할 수 있다. 이는 다형성을 지원하는 기본적인 메커니즘 제공
    }
}

