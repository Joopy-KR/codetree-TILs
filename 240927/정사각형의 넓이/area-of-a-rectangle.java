import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * n;
        System.out.println(size);
        if (n < 5) {
            System.out.println("tiny");
        }
    }
}