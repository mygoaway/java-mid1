package enumeration.ex1;

import static enumeration.ex1.StringGrade.*;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if(grade.equals(BASIC)) {
            discountPercent = 10;
        } else if(grade.equals(GOLD)) {
            discountPercent = 20;
        } else if(grade.equals(DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " 할인 X");
        }

        return price * discountPercent / 100;
    }
}
