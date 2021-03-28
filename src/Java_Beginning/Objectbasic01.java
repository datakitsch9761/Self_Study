package Java_Beginning;

public class Objectbasic01 {
    public static void main(String[] args) {
            //기존에 사용하던 방식
        System.out.println("---- 1번 계산기 사용 ----");
        System.out.println(add(10));
        System.out.println(add(20));
        System.out.println(add(30));

        System.out.println("---- 2번 계산기 사용----");
        System.out.println(add2(1));
        System.out.println(add2(2));
        System.out.println(add2(3));
    }
    //1번 계산기
    static int result = 0;
    //int add -> 메서드
    static int add(int n){
        result += n;
        return result;
    }
    //2번 계산기
    static int result2 = 0;
    static int add2(int n) {
        result2 += n;
        return result2;
    }
}
