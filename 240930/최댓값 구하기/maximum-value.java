import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int MAX_VAL = a;
        if (b > MAX_VAL) {
            MAX_VAL = b;
        }
        if (c > MAX_VAL) {
            MAX_VAL = c; 
        }
        System.out.println(MAX_VAL);
    }
}