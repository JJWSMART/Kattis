
import java.util.*;
//https://open.kattis.com/problems/eulersnumber
public class e {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = Integer.parseInt(reader.nextLine());
    double solution = 1;
    if(n >= 15){
      System.out.println("2.718281828458995");
    }
    else {
      for (int i = 1; i <= n; i++) {
        solution += ((double) 1) / ((double) fact(i));
      }
      System.out.println(solution);
    }
  }
  static long fact(long a) {
    long value = 1;
    for (int i = 2; i <= a; i++) {
      value *= i;
    }
    return value;
  }
}
