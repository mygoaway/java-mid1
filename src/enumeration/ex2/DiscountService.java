package enumeration.ex2;

import static enumeration.ex2.ClassGrade.BASIC;
import static enumeration.ex2.ClassGrade.DIAMOND;
import static enumeration.ex2.ClassGrade.GOLD;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        int discountPercent = 0;

        if(grade == BASIC) {
            discountPercent = 10;
        } else if(grade == GOLD) {
            discountPercent = 20;
        } else if(grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " 할인 X");
        }

        return price * discountPercent / 100;
    }
}
