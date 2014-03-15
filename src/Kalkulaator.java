
public class Kalkulaator extends Kasutaja{
	protected double fat;
	protected double KMI;
	protected double BAV;

	public Kalkulaator() {
		
	}
	public Kalkulaator(int vanus, int pikkus, char sugu, double kaal) {
		super(vanus, pikkus, sugu, kaal);
		// TODO Auto-generated constructor stub
	}
	public double arvutaKMI() {
		return pikkus;
	}
	public double arvutaBAV() {
		return kaal;
	}
	public double arvutaRasvaprotsent() {
		return vanus;
	}
}
