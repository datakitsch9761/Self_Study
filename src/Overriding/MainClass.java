package Overriding;

public class MainClass {
    public static void main(String[] args) {
//  메서드 재정의
//  1.부모클래스에서 물려받은 메서드를 같은 이름으로 생성하여,
//  내용물만 바꾸어 사용하는것

        Parent p = new Parent();
        p.method1();
        p.method2();

        System.out.println();
        Child c = new Child();
        c.method1(); //부모님 클래스에서 상속받은 메서드
        c.method2(); //오버라이딩 된 메서드
        c.method3(); //자식의 고유한 메서드
    }
}
