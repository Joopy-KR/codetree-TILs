import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int weather = sc.nextInt();
        if (3 <= weather && weather <= 5) {
            System.out.println("Spring");
        }
        else if (6 <= weather && weather <= 8) {
            System.out.println("Summer");
        }
        else if (9 <= weather && weather <= 11) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
    }
}