package inherit2;

public class MainClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.age = 20;
        s.studentId = "123123";

        System.out.println(s.info());

        Teacher t = new Teacher();
        t.name = "이지명";
        t.age = 60;

    }
}
