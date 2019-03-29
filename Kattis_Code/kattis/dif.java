import java.util.*;
public class dif{

	public static int check(int [] p, int [] q, int m){
		for(int i = 0; i < m-1; i++){
				if(p[i]==q[i])  continue;
				if(p[i] > q[i]) return 1;
				if(p[i] < q[i]) return 0;	
		}
		return 0;
	}

	public static void sub(int [] tmp, int [] p, int [] q, int m){
		for(int i = m-1; i>=0; i--){
			if(p[i] >= q[i]){
			    	tmp[i] = p[i] - q[i];
			}else{
			    	tmp[i] = 10 - q[i] + p[i];
			        p[i-1] = p[i-1] - 1; 
			}
		}
		
		String s = "";
		for(int i = 0; i < m; i++){
			s += Integer.toString(tmp[i]);
		}
		
		String newStr = s.replaceAll("^(0+)", ""); 
		`System.out.println(newStr);
	}

	public static int max(int a, int b){
		return a < b ? b : a;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String [] l = sc.nextLine().split(" ");

		int m = l[0].length();
		int n = l[1].length();

		int max = max(m, n);
		int [] p = new int [max];
		int [] q = new int [max];
		int [] tmp = new int[max];
		
		int a = max-1;
		int b = max-1;
		
		for(int i = m-1; i >=0; i--){
			p[a--] = Character.getNumericValue(l[0].charAt(i));
		}

		for(int j = n-1; j >= 0; j--){
			q[b--] = Character.getNumericValue(l[1].charAt(j));
		}
		
		if(check(p,q,m) == 1){
			sub(tmp, p, q, max);
		}else if (check(p,q,m) == 0){
			sub(tmp, q, p, max);
		}				
	}
}







