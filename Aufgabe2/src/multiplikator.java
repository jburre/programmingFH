
public class multiplikator {
	
	public static int multi(){
		int ret=0;
		for (int i= 1; i<=9;i++){
			int j=i+1;
			ret+=i*j;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1*2*3*4*5*6*7*8*9*10="+multi());
	}

}
