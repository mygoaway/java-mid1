package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 반복문의 루프 태부에서는 최적화가 되는 것 처럼 보이지만, 반복 횟수만큼 객체를 생성해야해서 시간이 오래걸린다.
        // 100,000번의 String 객체를 생성했을 것이다.
        String result = "";
        for(int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println((endTime - startTime) + "ms");
    }
}
