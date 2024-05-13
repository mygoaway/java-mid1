package exception.basic.checked;

public class Client {
    // throws => 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드
    public void call() throws MyCheckedException {
        // 문제 상황(예외 발생)
        throw new MyCheckedException("ex");
    }
}
