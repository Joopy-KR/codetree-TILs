import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A_math = sc.nextInt();
        int A_eng = sc.nextInt();
        int B_math = sc.nextInt();
        int B_eng = sc.nextInt();
        if (A_math > B_math) {
            System.out.println("A");
        }
        else if (A_math < B_math) {
            System.out.println("B");
        }
        // 점수가 같다면
        else {
            System.out.println(A_eng > B_eng ? "A" : "B");
        }
    }
}