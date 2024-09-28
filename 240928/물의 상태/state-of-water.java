import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(br.readLine());
        if (temp < 0) {
            System.out.println("ice");
        }
        else if (temp >= 100) {
            System.out.println("vapor");
        }
        else {
            System.out.println("water");
        }
    }
}