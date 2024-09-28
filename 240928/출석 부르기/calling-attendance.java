import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println("John");
        }
        else if (num == 2) {
            System.out.println("Tom");
        }
        else if (num == 3) {
            System.out.println("Paul");
        }
        else {
            System.out.println("Vacancy");
        }
    }
}