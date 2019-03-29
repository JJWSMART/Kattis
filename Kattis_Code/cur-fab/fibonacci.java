// 1, 1, 2, 3, 5, 8, 13, 21
public class fibonacci{
	public static void main(String [] args){
		int m = 1;
		int n = 1;
		int tmp = 0;
		for(int i = 0; i< 10; i++){
			if(i == 0){
				System.out.println(1);
			}else if(i == 1){
				System.out.println(1);
			}else{
				if(i%2 == 0){
					tmp = m + n;
					n = tmp;
					System.out.println(n);
				}else{
					tmp = m + n;
					m = tmp;
					System.out.println(m);
				}		
			}	
		}
	}
}