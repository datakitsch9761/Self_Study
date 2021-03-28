package Java_Beginning;

import java.util.Scanner;

public class SwithExample {
    public static void main(String[] args) {
        // switch 문은 다중 분기 구조이므로 복합 if 문의 논리적인 구조를 간결하게 표션
        // if 문과 달리 조건식이 사용되지 않고, 값을 가지는 변수또는 표혁식이 판단조건으로 사용되며, 연산 결과의 데이터 타입은 int,String,Enum(열거형)이 사용
        // case문 뒤에 사용되는 겂은 변수를 사용할 수 없고, 반드시 상수를 사용해야 합니다.
        // switch - case 문에서는 defualt는 if else 에서 else와 비슷한 효과를 가집니다

        Scanner scan = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int point = scan.nextInt();

        switch (point / 10  ){
        case 9:
            if(point >= 90) {
                System.out.println("A+ 학점입니다");
            } else {
                System.out.println("A 학점입니다");
            }
            break;

            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("F");
                break;
            default:
                System.out.println("넌 그냥 낙제야 ㅋㅋㅋㅋ");
                break;
        }
    }
}
