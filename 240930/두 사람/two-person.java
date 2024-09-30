import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int firstAge = sc.nextInt();
        String firstName = sc.next();
        int secondAge = sc.nextInt();
        String secondName = sc.next();
        if ((firstAge >= 19 && firstName.equals("M")) || ((secondAge >= 19 && secondName.equals("M")))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}