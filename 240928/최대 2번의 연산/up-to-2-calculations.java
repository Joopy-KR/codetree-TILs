import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a % 2 == 0) {
            a /= 2;
        }
        if (a % 2 == 1) {
            a += 1;
            a /= 2;
        }
        System.out.println(a);
    }
}