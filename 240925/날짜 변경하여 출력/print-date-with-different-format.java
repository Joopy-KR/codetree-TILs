import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();
        System.out.printf("%s-%s-%s", month, day, year);
    }
}