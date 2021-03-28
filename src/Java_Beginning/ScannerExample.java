package Java_Beginning;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // 1. 스캐너 기능을 생성한다
        Scanner scanner = new Scanner(System.in);

        // 2.스캐너가 가지고 있는 기능을 통해서 데이트를 입력받늠.
        System.out.print("자기소개를 입력해주세요 -> ");
        String intro = scanner.nextLine(); //공백을 포함하는 문자열 받음

        System.out.print("이름은 :");
        String name = scanner.nextLine();//공백을 포함하지 않는 문자열 받음

        System.out.print("나이 >");
        int age = scanner.nextInt();

        System.out.println("자기소개 : " + intro);
        System.out.println("이름 : " + name + ", 나이 " + age);

        //3.스캐너 기능 종료
        scanner.close();
    }
}
