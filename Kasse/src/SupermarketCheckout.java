
public class SupermarketCheckout extends Thread{

	private String name;
	private int maxQueueLength;
	private double performance;
	
	public SupermarketCheckout(String n, double p, int i){
		this.name=n;
		this.maxQueueLength=i;
		this.performance=p;
	}
}
