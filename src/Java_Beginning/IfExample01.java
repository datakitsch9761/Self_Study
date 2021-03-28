package Java_Beginning;

public class IfExample01 {
    public static void main(String[] args) {

        // if(boolean 조건){
        // } else {
        //거짓 일 때 실행 할 내용이 들어감
        //}
        int point = (int) (Math.random() * 101);
        System.out.println("점수 : " + point);

        if (point >= 60) {
            System.out.println("합격입니다");
            System.out.println("축하합니다");
        } else {
            System.out.println("불합격입니다");
            System.out.println("다시도전하세요");
        }
    }
}
