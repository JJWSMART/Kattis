import java.util.*;
import java.util.Scanner;

public class aah{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		String s_o = sc.nextLine();
		String s_t = sc.nextLine();

		int i = 0, j =0, a = 0, b = 0;
		for(; i < s_o.length(); i++){
			if(s_o.charAt(i)=='a')
				a++; 
		}

		for(; j < s_t.length(); j++){
			if(s_t.charAt(j)=='a')
				b++;
		}

		if(b>a){
			System.out.println("no");
		}else{
			System.out.println("go");
		}
	}
}