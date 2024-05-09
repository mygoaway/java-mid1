package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // String -> Integer
        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);

        // Integer -> int
        int i = integer.intValue();
        System.out.println("i = " + i);

        // int -> Integer
        Integer newInteger = Integer.valueOf(i);
        System.out.println("newInteger = " + newInteger);
    }
}
