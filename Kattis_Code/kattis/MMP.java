import java.util.*;
public class MMP{

	public static int max(int a, int b)
	{
    	return a < b ? b : a;
	}

	public static int min (int a, int b)
	{
    	return a < b ? a : b;
	}

	public static int crackers(int m, int a, int b){
		if(m == 1) return (b*(b+1)-a*(a+1))/2;
		if(b<a) return 0;
		int least = 9999999;
		for(int i = a + 1; i < b + 1; i++){
			least = min(i + max(crackers(m-1, a, i-1), crackers(m, i, b)), least);
		}
		return least;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int re = 0;
		//solve for non-input
		int a = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < a; i++){
			String [] in = sc.nextLine().split(" ");
			int numBox = Integer.parseInt(in[0]);
			int maxCrk = Integer.parseInt(in[1]);
			int result = crackers(numBox, 0, maxCrk);
			System.out.println(result);
		}
	}
}