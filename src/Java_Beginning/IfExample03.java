package Java_Beginning;

import java.util.Scanner;

public class IfExample03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("점수입력 >");
        int point = scan.nextInt();

        if(point == 100) {
            System.out.println("축하드립니다 만점입니다");

            if (point > 90) {
                System.out.println("A+ 학점입니다");
            } else {
                System.out.println("A 학점입니다");
            }
        }else if(point >= 80) {
            System.out.println("B 학점입니다!");
        } else if(point >= 70){
            System.out.println("C 학점입니다!");
        } else{
            System.out.println("F 학점입니다");
        }
    }
}
