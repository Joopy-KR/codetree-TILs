import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        int first = arr[0];
        for (int i = 0; i < 3; i++) {
            if (arr[i] < first) {
                System.out.print("0 ");
                break;
            }
            else {
                if (i == 2) {
                    System.out.print("1 ");
                }
            }
        }
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}