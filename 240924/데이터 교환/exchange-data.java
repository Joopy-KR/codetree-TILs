public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp_b = b;
        int temp_c = c;
        b = a;
        c = temp_b;
        a = temp_c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}