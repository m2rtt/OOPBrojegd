
public class Kasutaja {
	protected int vanus;
	protected int pikkus; // sentimeetrites
	protected char sugu; // 'M' või 'N'
	protected double kaal; // kilodes
	protected String nimi;
	public Kasutaja(int vanus, int pikkus, char sugu, double kaal, String nimi) {
		super();
		this.vanus = vanus;
		this.pikkus = pikkus;
		this.sugu = sugu;
		this.kaal = kaal;
		this.nimi = nimi;
	}
	public Kasutaja() {
		
	}
	// esialgu lambist kõik getterid ja jaanid
	int getVanus() {
		return vanus;
	}
	void setVanus(int vanus) {
		this.vanus = vanus;
	}
	int getPikkus() {
		return pikkus;
	}
	void setPikkus(int pikkus) {
		this.pikkus = pikkus;
	}
	char getSugu() {
		return sugu;
	}
	void setSugu(char sugu) {
		this.sugu = sugu;
	}
	double getKaal() {
		return kaal;
	}
	void setKaal(double kaal) {
		this.kaal = kaal;
	}
	String getNimi() {
		return nimi;
	}
	void setNimi(String nimi) {
		this.nimi = nimi;
	}
	@Override
	public String toString() {
		return "Kasutaja [vanus=" + vanus + ", pikkus=" + pikkus + ", sugu="
				+ sugu + ", kaal=" + kaal + ", nimi=" + nimi + "]";
	}
}
