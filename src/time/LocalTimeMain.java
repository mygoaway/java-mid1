package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        // 모든 날짜 클래스는 불변이다. 변경이 발생하는 경우, 새로운 객체를 생성해서 반환해야 한다.
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);
        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        // 계산(불변)
        ofTime = ofTime.plusSeconds(10);
        System.out.println("지정 시간+10d = " + ofTime);
    }
}
