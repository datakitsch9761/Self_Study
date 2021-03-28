package Java_Beginning;

public class Method03 {
    public static void main(String[] args) {
        //반환유형(return)
        //1.반환 유형은 전달할 값에 대한 데이터 타입입니다
        //2.반환값이 있는 메서드는 호출문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로 사용할 수 있습니다
        //3.메서드가 반환값이 없다면 반환유형 자리에 void를 적습니다
        //4.모든 메서드는 return을 만나면 강제 종료됩니다.
        //따라서 return문 아래에는 코드를 작성할 수 없습니다
        int result = add(1,3);
        System.out.println(result);

        int result2= add(add(1,2),add(3,4));
        System.out.println(result2);

        multi(10,20); // void형 메서드는 단순히 호출만 가능합니다.
                            // void형 메서드는 돌아오는 값이 없기 때문에 호출만 가능하다.
        sub();
    }
    static int add(int a,int b){
        return a + b;
    }
    static void multi(int a, int b){ //void 작성시 return을 작성하지 않아도 된다
        System.out.println(a + " X " + b + " = " + a*b);
    }
    static void sub(){
        System.out.println("2 - 1 = 1");
    }
    static void print(){
        return; // return 뒤에 값을 싫어 넘길수는 없다 (return = 값의 반환과 / 메서드를 종료한다는 뜻)
    }           // return문 뒤에는 코드 작성이 불가능 하다
}
