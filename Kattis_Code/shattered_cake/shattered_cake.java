import java.util.*;
/**
	transported vt.运输
	pothole 	n. 壶穴
	shatter 	vt. 粉碎

 	* step1: add all the length and divide by 2
 	* step2: 
*/


public class shattered_cake{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int width = Integer.parseInt(sc.nextLine());
		int num = Integer.parseInt(sc.nextLine());
		int output = 0;
		
		for(int i = 0; i < num; i++){
			String s[] = sc.nextLine().split(" ");
			int wid = Integer.parseInt(s[0]);
			int lth = Integer.parseInt(s[1]);
			output += wid * lth;
		}
		output = output / width;
		System.out.println(output);
	}
}