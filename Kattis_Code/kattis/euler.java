import java.util.*;
public class euler{
	
	public static long factor(int n){
		if(n == 0) return 1;
		else return n*(factor(n-1));
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		if(n >= 15){
     	 System.out.println("2.718281828458995");
    	}
    	else{
			for(int i = 0; i <= n; i++){
				double k = factor(i);
				double l = (double)1/k;
				sum += l;
			}
			System.out.println(sum);
		}
	
	}
}