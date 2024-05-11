package enumeration.ref3;


import static enumeration.ref3.Grade.*;

public class GradeEnumRef3_1 {
    public static void main(String[] args) {
        int price = 1000;

        printDiscount(BASIC, price);
        printDiscount(GOLD, price);
        printDiscount(DIAMOND, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " = " + grade.discount(price));

    }
}
