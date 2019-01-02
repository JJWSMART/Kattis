import java.util.*;//for scanner

/*
 –  Each method waits until the user presses Enter. 
 –  The value typed by the user is returned.
 */
public class scanner{

	public static void main(String[]args){
		
		//接收键盘的输出和输入
		Scanner sc = new Scanner(System.in);
		int flag = 0, mbytes = 0, monthes = 0, sum = 0;
		//reads an int from the user and returns it
		while(true){
			
			flag++;

			if (flag == 1){
				mbytes = sc.nextInt();   //程序运行到next会堵塞，等待键盘的输入
				continue;
			}

			if (flag == 2){
				monthes = sc.nextInt();
				continue;
			}
			
			int b = sc.nextInt();  
			sum = mbytes - b + sum;
			
			if(flag > monthes+1){
				break;
			} 
		} 
		sum += mbytes;
		System.out.println(sum);
	}
}

