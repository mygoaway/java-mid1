package lang.string.method;

import java.util.Locale;

import static java.util.Locale.ROOT;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "     java Programming";

        System.out.println(strWithSpaces.toLowerCase(ROOT));
        System.out.println(strWithSpaces.toUpperCase(ROOT));
        System.out.println(strWithSpaces.trim());
        System.out.println(strWithSpaces.strip()); // 공백 제거 및 유니코드 공백도 제거 포함 (자바 11 이상)
        System.out.println(strWithSpaces.stripLeading()); // 앞 공백 제거
        System.out.println(strWithSpaces.stripTrailing()); // 뒤 공백 제거

    }
}
