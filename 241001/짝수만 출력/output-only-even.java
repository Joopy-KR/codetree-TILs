import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (true) {
            if (a % 2 == 1) a += 1;
            if (a > b) break;
            System.out.print(a + " ");
            a++;
        }
    }
}