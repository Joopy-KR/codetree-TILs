import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        switch (word) {
            case "S":
                System.out.println("Superior");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Usually");
                break;
            case "D":
                System.out.println("Effort");
                break;
            default:
                System.out.println("Failure");
                break;
        }
    }
}