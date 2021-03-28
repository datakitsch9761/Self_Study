package Java_Beginning;

public class PenMain {
    public static void main(String[] args) {
        //Pen의 기능과 속성을 사용하려면
        //설계용 클래스를 객체로 생성해야 합니다.

        //객체의 기능과 속성을 사용하기 위해서는 참조연산자 . 을 사용합니다.
        Pen black = new Pen();
        black.ink = "검정";
        black.price = 500;
        black.write();
        black.info();

        System.out.println();

        Pen red = new Pen();
        red.ink = "빨강";
        red.price =1000;
        red.write();
        red.info();
    }
}
