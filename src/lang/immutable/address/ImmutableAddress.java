package lang.immutable.address;

// 불변 객체
public class ImmutableAddress {
    // 불변이라는 단순한 제약을 사용해서 사이드 이펙트를 예방
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
