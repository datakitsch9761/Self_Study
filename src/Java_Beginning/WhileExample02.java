package Java_Beginning;

import java.util.Scanner;

public class WhileExample02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수입력 > : ");
        int num =scan.nextInt();

        int a = 2;
        while(num % a != 0 ){

            a++;
        }
        if(num == a){
            System.out.println(num + " 소수입니다");
        } else{
            System.out.println(num + " 소수가 아닙니다");
        }
    }
}
