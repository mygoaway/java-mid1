package exception.basic.unchecked;


public class UnCheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
