package lang.math;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] generate = lottoGenerator.generate();
        for (int i : generate) {
            System.out.println("i = " + i);
        }
    }
}
