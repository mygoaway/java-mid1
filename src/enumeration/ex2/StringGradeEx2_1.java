package enumeration.ex2;

import static enumeration.ex2.ClassGrade.BASIC;
import static enumeration.ex2.ClassGrade.DIAMOND;
import static enumeration.ex2.ClassGrade.GOLD;

public class StringGradeEx2_1 {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price); // 10% 할인 금액
        int gold = discountService.discount(GOLD, price); // 20% 할인 금액
        int diamond = discountService.discount(DIAMOND, price); // 30% 할인 금액

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
