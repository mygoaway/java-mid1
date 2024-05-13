package exception.basic.unchecked;


/*
* Unchecked 예외는
* 예외를 잡거나, 던지지 않아도 된다.
* 예외를 잡지 않으면 자동으로 밖으로 던진다.
* */
public class Service {
    Client client = new Client();

    /*
    * 필요한 경우 예외를 잡아서 처리할 수 있다.
    */
    public void callCatch() {
        try {
            client.call();
        } catch (MyUnCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /* 체크 예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
    */
    public void catchThrow() {
        client.call();
    }
}
