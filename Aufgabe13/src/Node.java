
public class Node {

	int value;
	Node left;
	Node right;
	
	public Node (int value, Node left, Node right){
		this.value=value;
		this.left=left;
		this.right=right;
	}
	
	public String toString(){
		return value +"";
	}
	
	public static String inorder(Node cur){
		if (cur==null) return "";
		return inorder(cur.left)+cur.value+inorder(cur.right);
	}
	
	public static String postorder (Node cur){
		if (cur==null) return "";
		return postorder(cur.left)+postorder(cur.right)+cur.value;
	}
	
	public static String preorder(Node cur){
		if (cur== null) return"";
		return cur.value+preorder(cur.left)+preorder(cur.right);
	}
}
