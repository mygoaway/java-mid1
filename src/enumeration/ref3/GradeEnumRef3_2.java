package enumeration.ref3;


import static enumeration.ref3.Grade.*;

public class GradeEnumRef3_2 {
    public static void main(String[] args) {
        int price = 1000;

        Grade[] values = values();
        for (Grade value : values) {
            printDiscount(value, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " = " + grade.discount(price));

    }
}
