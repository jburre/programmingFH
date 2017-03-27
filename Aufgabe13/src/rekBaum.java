
public class rekBaum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node tree = new Node(5,
				new Node(3,
				new Node(1, null, null),
				new Node(4, null, null)
				),
				new Node(8,
				new Node(6, null, null),
				new Node(9, null, null)
				)
		);
		System.out.println(inorder(tree));
		System.out.println(preorder(tree));
		System.out.println(postorder(tree));
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
