package Java_Beginning;

public class Method01 {
    public static void main(String[] args) {
        System.out.println("1 - 100 까지 합 : " + calSum());
        //System.out.println(random());
        String result = random();
        System.out.println(result);
    }
    static int calSum(){
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    static String random(){
        return "안녕하세요";
    }

}
