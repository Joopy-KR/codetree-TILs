import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int[] arr = new int[4];
        arr[0] = a > b ? 1 : 0;
        arr[1] = a > c ? 1 : 0;
        arr[2] = a > d ? 1 : 0;
        arr[3] = a > e ? 1 : 0;
        for (int ans: arr) {
            bw.write(ans + "\n");
        }
        bw.close();
    }
}