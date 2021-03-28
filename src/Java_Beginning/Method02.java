package Java_Beginning;

public class Method02 {
    public static void main(String[] args) {
        System.out.println(calSum(10));
        System.out.println(calSum(20));
        System.out.println(calSum(30));

        int result = calSum2(10,20);
        System.out.println("10 - 20까지의 합 : " + result);
    }

    //매개변수(parameter)
    //1.매개변수는 베서드 호출에 필요한 값을 메서드에 전달하기 위한 매개체 입니다.
    //2.매개변수 여러개를 받아주고 싶다면 , 로 연결 하면 됩니다.
    //3.매개변수를 하나도 받지 않을 수 있으며 이때는 ()를 비워둡니다.
    static int calSum(int end) { //int 라는 매개변수를 받는다 //외부로 부터 값을 받는게 매개 변
        int sum = 0;
        for (int i = 1; i <= end ; i++){
            sum += i;
        }
        return sum;
    }
    static int calSum2(int a, int b){ //모든 변수를 받을 수 있다
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}