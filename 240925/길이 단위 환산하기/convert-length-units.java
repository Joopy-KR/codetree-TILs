import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ONE_FEET = 30.48;
        double n = Double.parseDouble(br.readLine());
        System.out.printf("%.1f", n * ONE_FEET);
    }
}