package exception.ex4;


public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "https://example.com";


        // Try - With - Resources
        // 1. 리소스 누수 방지
        // 2. 코드 간결성 및 가독성 향상
        // 3. 스코프 범위 한정
        // 4. 조금 더 빠른 해제 : 기존에는 try - catch - finally 순서였는데, try with resources 구문은 try 블럭이 끝나면 즉시 close()를 호출
        try(NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data); // 추가
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
