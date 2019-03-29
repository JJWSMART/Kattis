/*
 * The first line: 2 cases
 * The sec line: the len of pole, n : the num of ants on the pole  
 * 
 *
 * Inflation:
 * 	n     6
 * 1,2,3,4,5,6
 * 
 */
import java.util.*;
public class ant{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int ca =Integer.parseInt(sc.nextLine());//line 1
		for(int i = 0; i < ca; i++){
			String s[] = sc.nextLine().split(" ");
			int len = Integer.parseInt(s[0]);
			int num = Integer.parseInt(s[1]);
			System.out.println(len);
			System.out.println(num);
			int l = 0;
			int arr[] = new int[num];
			while( l < num - 1){
				String news[] = sc.nextLine().split(" ");
				for(int j = 0; j < news.length; j++){
					arr[l] = Integer.parseInt(news[j]);
					System.out.println(arr[l]);
					l++;
				}
			}
			int min = arr[0];
			System.out.println("Original min" + min);
			int max = arr[0];
			int mid = len/2;
			int minmid = Math.abs(len/2 - arr[0]);
			int m = arr[0];
			for(int x=0; x<arr.length; x++){

				if(arr[x]<min){
					min=arr[x];
				}

				if(arr[x]>max){
					max = arr[x];
				}
				System.out.println("Math.abs(len/2 - arr[x])" + Math.abs(len/2 - arr[x]));
				if(Math.abs(len/2 - arr[x]) < minmid){
					m = arr[x];
					minmid = Math.abs(len/2 - arr[x]);
					System.out.println(m);
				}
			}
			
			System.out.println("This is min : " + min);
			System.out.println("This is max : " + max);
			System.out.println("This is minmid : " + m);
		}	
		//COMPARE EACH POSITION WHICH IS CLOSE TO THE MID POINT
	}
}