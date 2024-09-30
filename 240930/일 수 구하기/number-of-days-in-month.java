import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] thirtyone = new int[]{1, 3, 5, 7, 8, 10, 12};
        int[] thirty = new int[]{4, 6, 9, 11};
        int n = sc.nextInt();
        if (isContains(thirtyone, n)) {
            System.out.println(31);
        }
        else if (isContains(thirty, n)) {
            System.out.println(30);
        }
        else {
            System.out.println(28);
        }
    }

    public static boolean isContains(int[] arr, int key) {
        for (int elm: arr) {
            if (elm == key) {
                return true;
            }
        }
        return false;
    }
}