import java.util.*;
import java.util.Scanner;

public class sum{

	public static int sumP(int j){
		int sum = 0;
		for(int i = 0; i <= j; i++){
			sum += i;
		}
		return sum;
	}

	public static int sumO(int j){//if j == 0
		int sum = 0;
		for(int i = 0; i < j; i++){
			if(j == 1){
				sum += 1;
			}else{
				sum += i*2+1;
			}
			
		}
		return sum;
	}

	public static int sumE(int j){
		int sum = 0;
		for(int i = 0; i <=j; i++){
			sum += i*2;
		}
		return sum;
	}

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int [][]num = new int[a][a];

		for(int i = 0; i<a; i++){
			for(int j = 0; j< 2; j++){
				num[i][j] = sc.nextInt();
				if (j == 1){
					System.out.println((i+1) + " " + sumP(num[i][j]) + " " + sumO(num[i][j]) + " " + sumE(num[i][j]));
				}
			}
		}




	}
}