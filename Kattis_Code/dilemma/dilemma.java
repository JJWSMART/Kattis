import java.util.*;

public class dilemma{

	static int cnt = 0;

	public static int c3(String s, int [] co, int i){

		for(int k = 0; k <= i; k++){
			for(int v = k+1; v <= i; v++){
				if(co[k]==co[v]){
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		String[] num = sc.nextLine().split(" ");

		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = 0;

		for(int j = a; j <=b; j++){

			String s = Integer.toString(j);
			
			int[] co = new int[s.length()];

			for(int k = 0; k < co.length; k++){
				System.out.print(co[k]);
			}

			for(int i = 0; i < s.length(); i++){               
				co[i] = Character.getNumericValue(s.charAt(i));
				if(co[i]==0 || j % co[i] != 0 || c3(s, co, i) == 1){
					cnt--;
					break;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}