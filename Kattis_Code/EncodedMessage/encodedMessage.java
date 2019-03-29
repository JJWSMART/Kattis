import java.util.*;
import java.util.Scanner;

public class encodedMessage{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();

		int line = Character.getNumericValue(s.charAt(0));
		//System.out.println(line);

		int l = (int)Math.sqrt(s.length());//root

		char [][] word = new char [l][l];

		int idx = 1;
		for(int i = 0; i < l ; i++){
			for(int j = l-1; j >= 0; j--){
				word[i][j] = s.charAt(idx);
				idx++;
			}
		}

		for(int m = 0; m < l; m++){
			for(int n = 0; n < l; n++){
				System.out.print(word[n][m]);//print in a line 
			}
		}
		System.out.print("\n");
	}
}