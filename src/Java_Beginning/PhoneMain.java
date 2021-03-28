package Java_Beginning;

public class PhoneMain {
    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.info();

        System.out.println();

        Phone white = new Phone("화이트");
        white.info();

        System.out.println();

        Phone iphone = new Phone("블랙",1000000);
        iphone.info();



        //일반적으로 생성자는 기본생성자와, 모든 멤버변수를 초기화 해주는
        // 생성자로 2개를 가장 많이 사용합니다.
    }
}
