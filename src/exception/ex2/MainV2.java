package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args){
        //NetworkServiceV2_1 service = new NetworkServiceV2_1();
        //NetworkServiceV2_2 service = new NetworkServiceV2_2();
        //NetworkServiceV2_3 service = new NetworkServiceV2_3();
        NetworkServiceV2_4 service = new NetworkServiceV2_4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String data = scanner.nextLine();
            if(data.equals("exit")){
                break;
            }

            service.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
