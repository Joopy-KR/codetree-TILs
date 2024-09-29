import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[6];
        arr[0] = a >= b ? 1 : 0;
        arr[1] = a > b ? 1 : 0;
        arr[2] = a <= b ? 1 : 0;
        arr[3] = a < b ? 1 : 0;
        arr[4] = a == b ? 1 : 0;
        arr[5] = a != b ? 1 : 0;
        for (int ans: arr) {
            System.out.println(ans);
        }
    }
}