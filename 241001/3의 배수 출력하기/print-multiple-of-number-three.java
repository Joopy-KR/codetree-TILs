import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i * 3 <= n) {
            System.out.print((i * 3) + " ");
            i += 1;
        }
    }
}