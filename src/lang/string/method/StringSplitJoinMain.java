package lang.string.method;

import static java.util.Locale.ROOT;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
