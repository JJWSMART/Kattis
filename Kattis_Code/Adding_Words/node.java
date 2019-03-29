public class Node{

	private String k;
	private int v;
	private Node next;
	private Node prev;

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