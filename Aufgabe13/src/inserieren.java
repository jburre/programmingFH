
public class inserieren {

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
				
				insert(2, tree);
				insert(7, tree);
				insert(10, tree);
				
				System.out.println(inorder(tree));
	}
	
	private static void insert(int i, Node n) {
		// TODO Auto-generated method stub
		if (i <n.value){
			if (n.left!=null) {
				insert(i, n.left);
				}
			else {
				n.left=new Node(i,null,null);
			}
		}
		if (i>n.value){
			if(n.right!=null){
				insert(i,n.right);
			}
			else {
				n.right=new Node(i,null,null);
			}
		}
	}

	public static String inorder(Node cur){
		if (cur==null) return "";
		return inorder(cur.left)+cur.value+inorder(cur.right);
	}

}
