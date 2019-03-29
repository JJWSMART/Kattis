/*

String fooString1 = new String("foo");
String fooString2 = new String("foo");

// Evaluates to false
fooString1 == fooString2;

// Evaluates to true
fooString1.equals(fooString2);

// Evaluates to true, because Java uses the same object
"bar" == "bar";

*/

import java.util.*;
public class boatParts{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int numParts = sc.nextInt();
		int numDays  = sc.nextInt();
		sc.nextLine();
		String s[] = new String[numDays];
		
		int cnt = numDays;
		for(int i = 0; i < numDays; i++){
			s[i] = sc.nextLine();
		}
		
		for(int i = 0; i < numDays; i++){
			//System.out.println(s[i]);
			for(int j = i+1; j < numDays; j++){
				if(s[i].equals(s[j])){
					s[j] = "repeat";
				}
			}
		}
		
		for(int m = numDays-1; m >= 0; m--){
			if(s[m]=="repeat"){
				cnt--;
			}
		}

		int days = 0;
		for(int m = numDays-1; m >= 0; m--){
			if(s[m]!="repeat"){
				days = m+1;
				break;
			}

		}
		
		if(cnt<numParts){
			System.out.println("paradox avoided");
		}else{
			System.out.println(days);
		}
		
	}
}