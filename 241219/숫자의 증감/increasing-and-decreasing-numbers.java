import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String c = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        if (c.equals("A")) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
}