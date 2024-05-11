package enumeration;

import enumeration.ex3.Grade;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반영
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환
        Grade gold = Grade.valueOf("GOLD");
        System.out.println("gold = " + gold);

        // 잘못된 String 입력시, illegalArgumentException 발생
        //Grade gold1 = Grade.valueOf("gold");
        //System.out.println("gold1 = " + gold1);
    }
}
