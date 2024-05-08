package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        // return getClass().getName() + "@" + Integer.toHexString(hashCode()); 클래스이름@객체참조값

        // toString() 반환값 출력
        System.out.println(string);

        System.out.println(object);
        // System.out.println(object.toString());

        Car car = new Car("그랜저");
        Dog dog1 = new Dog("멍멍", 15);
        Dog dog2 = new Dog("멍멍", 15);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println에서 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
