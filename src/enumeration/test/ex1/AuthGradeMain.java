package enumeration.test.ex1;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            printAuthGrade(value);
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println(authGrade.name() + "("+authGrade.getDescription() +")");
        System.out.println("level=" + authGrade.getLevel());
        System.out.println("description=" + authGrade.getDescription());
    }
}
