
public class zaehlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node tree = new Node(5,
				new Node(3,
				new Node(1, null, null),
				new Node(4, null, null)
				),
				new Node(8,
				new Node(6, null, null),
				new Node(9, 
						new Node (37,
								new Node (17,null,null),
								new Node (42,null,null)
								),
								null
				)
				)
				);
		System.out.println(countNodes(tree));
		System.out.println(height(tree));
	}
	
	public static int countNodes(Node n){
		int i=1;
		if (n.left!=null){
			i+= countNodes(n.left);
		}
		if (n.right!=null){
			i+=countNodes(n.right);
		}
		return i;
	}
	

	private static int countEdges(Node n, int i) {
		// TODO Auto-generated method stub
		if (n.left!=null){
			i+=1;
			i+=countEdges(n,i);
		}
		if(n.right!=null){
			i+=1;
			i+=countEdges(n,i);
		}
		return i;
	}
	
	public static int height(Node n){
		if(n==null) return 0;
		else {
			return 1+Math.max(height(n.left), height(n.right));
		}
	}



}
