package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // 동등성이라는 개념은 각각의 클래스 마다 다르다.
    // 어떤 클래스는 주민번호 기반 동등성 처리, 어떤 클래스는 회원 번호 기반으로 동등성 처리
    // 따라서 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의하면 된다.
    // 그렇지 않으면 Object는 동일성 비교를 기본으로 제공한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
