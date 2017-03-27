
public class sortieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto[] autos = {
				new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0),
				new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0),
				new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0)
				};
				bubbleSort(autos);
				for(Auto a : autos) {
				System.out.println(a);
				}
				
	}

	private static void bubbleSort(Auto[] autos) {
		// TODO Auto-generated method stub
			boolean unsorted=true;
			while (unsorted) {
			unsorted = false;
			for (int i=0; i < autos.length-1; i++) {
			if (!(autos[i].getEUR() >= autos[i+1].getEUR())) {
			Auto dummy = autos[i];
			autos[i] = autos[i+1];
			autos[i+1] = dummy;
			 unsorted = true;
				}

				}

			}
	}
}