package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class<Hello> helloClass = Hello.class;
        // 선택된 생성자를 기반으로 인스턴스를 생성한다.
        Hello hello = helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
