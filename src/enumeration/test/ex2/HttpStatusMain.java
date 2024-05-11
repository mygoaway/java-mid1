package enumeration.test.ex2;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE: ");
        int httpCodeInPut = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInPut);
        if(status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(status.getCode() + " " + status.getMessage());
            System.out.println("isSuccess = " + status.isSuccess());
        }

    }


}
