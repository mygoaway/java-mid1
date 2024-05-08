package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        action(car);
        action(dog);
    }

    // Object는 모든 객체의 부모로 어떤 객체든지 인자로 전달할 수 있다.
    private static void action(Object object) {
        // 객체에 맞는 다운캐스팅 필요
        if(object instanceof Car car) {
            car.move();
        } else if (object instanceof Dog dog) {
            dog.sound();
        }
    }
}
