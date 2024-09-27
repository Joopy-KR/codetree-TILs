import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int garo = Integer.parseInt(st.nextToken());
        int sero = Integer.parseInt(st.nextToken());
        garo += 8;
        sero *= 3;
        System.out.println(garo);
        System.out.println(sero);
        System.out.println(garo * sero);
    }
}