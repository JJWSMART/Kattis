public class recur_fibonacci{

	public static int fibonacci(int n){
		if(n==0){return 1;}
		else if(n==1){return 1;}
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String [] args){
		int n = fibonacci(4);
		System.out.println(n);
	}
}