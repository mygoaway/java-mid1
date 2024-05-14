package exception.ex2;


public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가


        try{
            // 정상 흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            // 예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            // 반드시 호출해야 하는 마무리 흐름
            client.disConnect();
        }
    }
}
