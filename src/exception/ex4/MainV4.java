package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args){
        //NetworkServiceV4 service = new NetworkServiceV4();
        NetworkServiceV5 service = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String data = scanner.nextLine();
            if(data.equals("exit")){
                break;
            }

            try {
                service.sendMessage(data);
            } catch (Exception e) {
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다."); // 화면
        System.out.println("==개발자용 디버깅 메시지=="); // 개발자 로깅 파일
        e.printStackTrace(System.out); // 스택 트레이스 출력
        //e.printStackTrace();

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendExceptionV4) {
            System.out.println("[전송 오류] 전송 데이터: " + sendExceptionV4.getSendData());
        }


    }
}
