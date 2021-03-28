package Overriding;

public class Child extends Parent{

    @Override
    void method2() {
        System.out.println("자식의 재정의된 메서드 실행");
    }
    void method3(){
        System.out.println("자식의 3번 메서드 실행");
    }
}
