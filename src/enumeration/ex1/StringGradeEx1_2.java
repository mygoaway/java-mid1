package enumeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService discountService = new DiscountService();
        // 상수를 사용하지 않고, 직접 입력하는 경우 동일한 문제가 발생할 수 있음
        int basic = discountService.discount("basic", price); // 10% 할인 금액
        System.out.println("basic = " + basic);
    }
}
