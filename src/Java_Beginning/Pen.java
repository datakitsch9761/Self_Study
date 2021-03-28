package Java_Beginning;

//설계용 클래스는 메인 메서드를 작성하지 않습니다.

public class Pen {
    // 객체의 속성을 나타내는 것을 멤버변수(필드)라고 부릅니다.
    String ink; //각각 기본값으로 자동 초기화됩니다.
    int price;


    //객체의 기능을 나타내는 것을 메서드라고 부릅니다.
    void write(){
        System.out.println(ink + "색 글을 씁니다.");
    }

    void info(){
        System.out.println("-----펜의 정보-----");
        System.out.println("펜의 색깔 : " + ink);
        System.out.println("팬의 가격 : " + price);
    }
}
