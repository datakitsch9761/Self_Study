package Java_Beginning;

public class Phone {//멤버변수
    String color;
    String model;
    int price;

    Phone() { // 생성자(Constructor Function) -> 멤버변수를 초기화 하는 역할을 한다.
       color = "회색";
       model = "애니콜";
       price = 400000;
    }

    Phone(String pColor){
        color = pColor;
        model = "큐리텔";
        price = 500000;
    }

    Phone(String pColor,int pPrice){
        color = pColor;
        model = "Iphone";
        price = pPrice;
    }


    void info(){ //메서드
        System.out.println("----폰의 정보----");
        System.out.println("색상 :" + color);
        System.out.println("모델 :" + model);
        System.out.println("가격 :" + price);
    }
}