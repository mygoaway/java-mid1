package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // 반복문의 루프 태부에서는 최적화가 되는 것 처럼 보이지만, 반복 횟수만큼 객체를 생성해야해서 시간이 오래걸린다.
        // 100,000번의 String 객체를 생성했을 것이다.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100000; i++) {
            sb.append("Hello Java");
        }

        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println((endTime - startTime) + "ms");

        // StringBuilder를 직접 사용하는 것이 더 좋은 경우
        // 1. 반복문에서 반복해서 문자를 연결할 때
        // 2. 조건문을 통해 동적으로 문자열을 조합할 때
        // 3. 복잡한 문자열의 특정 부분을 변경할 때
        // 4. 매우 긴 대용량 문자열을 다룰 때

        // StringBuilder vs StringBuffer
        // StringBuilder -> 멀티 쓰레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다
        // StringBuffer -> 내부에 동기화가 되어 있어서, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느리다
    }
}
