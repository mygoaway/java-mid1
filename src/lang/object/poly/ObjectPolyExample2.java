package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Object[] objects = {new Car(), new Dog(), new Object()};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
