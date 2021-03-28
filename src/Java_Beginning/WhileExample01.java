package Java_Beginning;

public class WhileExample01 {
    public static void main(String[] args) {

        int a = 1; //제어변수 : 반복문의 반복횟수를 제어할 변수
        int sum = 0;

        while (a <= 10) {
            sum = sum + a;
             a++;
        }
        System.out.println("1-10까지의 합: " + sum);
    }
}
