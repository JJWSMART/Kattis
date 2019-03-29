import java.util.*;

class Node{

	String k;
	int v;
	Node next;

	public Node(){
		k = "";
		v = 0;
		next = null;
	}

	public Node(String k, int v, Node next){
		this.k = k;
		this.v = v;
		this.next = next;
	}

	public Node getNext(){
		return next;
	}

	public String getKey(){
		return k;
	}

	public int getValue(){
		return v;
	}
}

class LinkedList{

	private int count;
	Node head;
	Node tail;

	public LinkedList(){
		count = 0;
		head  = null;
		tail  = null;
	}

	public void addBack(String k, int v){

		Node tmp = new Node(k, v, null);
		
		if(count == 0){
			head = tmp;
			tail = tmp;
		}else{
			tail.next = tmp;
			tail = tmp;
		}
		count++;
	}

	public int count(){
		return count;
	}

	public void clear(){
		head = null;
		count = 0;
	}

	public int traverse(String k){
		
		for(Node tmp = head; tmp != null; tmp = tmp.next){
			if(tmp.k.equals(k)){
				return tmp.v;
			}
		}
		return -1;
	}

	public String result(int v){

		for(Node tmp = head; tmp != null; tmp = tmp.next){
			if(tmp.v == v){
				return tmp.k;
			}
		}
		return "unknown";
	}

	public void revise(String k, int v){
		for(Node tmp = head; tmp != null; tmp = tmp.next){
			if(tmp.k.equals(k)){
				tmp.v = v;
			}
		}
	}

	public String toString(){
		int i = 0;
		StringBuilder sb = new StringBuilder(count*10);

		sb.append("{");
		for(Node tmp = head; tmp != null; tmp = tmp.next){
			sb.append(tmp.getKey());
			
			if(count > i+1){
				sb.append(" " + tmp.getValue());
				sb.append(",");
			}
			
			if(tmp.next == null){
				sb.append(" " + tmp.getValue());
			}
			i++;
		}
		sb.append("}");
		
		return sb.toString();
	}
}


/*
 * Compare string 不要加空格
 */
public class AddingWord{

	public static void main(String[]args){

		LinkedList list = new LinkedList();

		Scanner sc = new Scanner(System.in);
		
		String  s1 = "clear";

		String  c1 = "def";

		String  c2 = "calc";	

		String str = "";	
		
		while(sc.hasNextLine() && !(str = sc.nextLine()).equals("")){

			String [] s3  = str.split(" ");
			
			if(s1.equals(s3[0])){
				list.clear();
			}
			
			if(c1.equals(s3[0])){
				if(list.traverse(s3[1])!= -1){
					list.revise(s3[1],Integer.parseInt(s3[2]));
				}else{			
					list.addBack(s3[1],Integer.parseInt(s3[2]));
				}
			}

			if(c2.equals(s3[0])){
				
				String s = "";
				
				int sum = 0;
				
				int len = s3.length;

				for(int i = 1; i < len; i++){
					s += s3[i];
					if(i<=len){
						s+=" ";
					}
				}
				
				for(int i = 1; i < len; i++){

					if(s3[i].equals("+")){
						i++;
						int a = list.traverse(s3[i]);
						if(a==-1){
							sum = -1;
							System.out.println(s + "unknown");
							break;
						}
						sum += list.traverse(s3[i]);

					}else if(s3[i].equals("-")){
						i++;
						int a = list.traverse(s3[i]);
						if(a==-1){
							sum = -1;
							System.out.println(s + "unknown");
							break;
						}
						sum -= list.traverse(s3[i]);

					}else if(s3[i].equals("=")){

						System.out.println(s + list.result(sum));
						break;
					}else{	

						sum += list.traverse(s3[i]);
					}
				}
			}
		}	
	}
}











