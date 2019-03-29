import java.util.*;

public class t{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt(), t = x * (n + 1);
        for (int i = 0; i < n; i++) {
            t -= sc.nextInt();
        }
        System.out.println(t);
    }
}
