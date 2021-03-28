package Overloading;

public class Basic {

    void input(int a){
        System.out.println("정수 1개 입력");
    }
//    int input(int b){
//        return b;
//    }

    void input(int a, int b){
        System.out.println("정수 2개 입력");
    }
    void input(double a, String s){
        System.out.println("실수 1개, 문자열 1개입력");
    }
    void input(String s, double b){
        System.out.println("문자열 1개, 실수 1개 입력");
    }
    void input(char c, String s, int i){
        System.out.println("문자 1개, 문자열 1개, 정수 1개 입력 ");
    }

}
