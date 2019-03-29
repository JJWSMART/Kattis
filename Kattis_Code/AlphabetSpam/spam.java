import java.util.*;
import java.util.Scanner;

/*
 * 用 scanner （while loop） 必须要有条件确定退出
 */
public class spam{

	public static void main(String [] args){
		//从键盘接受输入
		Scanner sc = new Scanner(System.in); //程序运行到next会堵塞，等待键盘的输入

		String s = sc.nextLine();

		int w = 0, l = 0, u = 0, p = 0, sum = 0;

		String[] arrOfStr = s.split("_");

		//先分词
		for(; w < arrOfStr.length; w++){

			String ns = arrOfStr[w];
			for(int i = 0; i < ns.length(); i++){
				int ascii = ns.charAt(i);
				if (ascii>=65 && ascii<=90){
					u++;
				}else if(ascii >= 97 && ascii <= 122){
					l++;
				}else{
					p++;
				}
			}
		}
		w--;
		sum = w + l + u + p;
		System.out.println((double)w/(double)sum);
		System.out.println((double)l/(double)sum);
		System.out.println((double)u/(double)sum);
		System.out.println((double)p/(double)sum);
	}
}