package whatGoesUp;

public class Planina {
	private String imePlanine;
	private int visina;

	public Planina(String ime, int v) {
		imePlanine = ime;
		visina = v;
	}

	public int getVisina() {
		return visina;
	}

	public String toString() {
		return imePlanine + "(" + visina + ")";
	}

}
