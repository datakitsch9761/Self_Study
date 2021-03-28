package Java_Beginning;

import java.util.Scanner;

public class ForExample02 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력 -> :");
        int num = scan.nextInt();
        int count = 0;
        for(int i = 1;i <= num;i++){
            if(num % i ==0){
                System.out.println(i);//약수
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + "은 소수입니다");
        } else{
            System.out.println(num + "은 소수가 아닙니다");
        }
    }
}