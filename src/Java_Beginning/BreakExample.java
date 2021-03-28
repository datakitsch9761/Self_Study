package Java_Beginning;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("--------------------");
            System.out.println("15 X 6 = ?");
            System.out.println(">");

            int answer = scanner.nextInt();

            if (answer ==90){
                System.out.println("정답입니다");
                break;
            }
            i++;
        }
    }
}
