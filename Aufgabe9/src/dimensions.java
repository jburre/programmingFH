
public class dimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]multi = new int [7][7];
		for (int a=0;a<7;a++){
			for (int b=0;b<7;b++){
				multi[b][a]=(b+1)*(a+1);
			}
		}
		for (int i = 0; i<7;i++){
			for (int j=0;j<7;j++){
			System.out.print(multi[i][j]+" ");
			}
			System.out.println();
		}
	}

}
