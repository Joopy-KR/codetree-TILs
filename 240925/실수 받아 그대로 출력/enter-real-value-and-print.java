import java.util.*;
import java.io.* ;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        
        double b = Double.parseDouble(a);
        System.out.printf("%.2f", b);
    }
}