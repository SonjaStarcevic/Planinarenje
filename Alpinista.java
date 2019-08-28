package whatGoesUp;

public class Alpinista extends Planinar {
	private int V = 3000;
	private Alpinista partner;

	public Alpinista(String ime, int kapacitet) {
		super(ime, kapacitet);
	}

	public Alpinista(String ime, int kapacitet, Alpinista partner) {
		super(ime, kapacitet);
		this.partner = partner;
	}

	public void dodeli(Planinar p) {
		partner = (Alpinista) p;
	}

	@Override
	public boolean uspesno(Uspon u) {
		if (partner == null || u.getPlanina().getVisina() < V)
			return false;
		else
			return true;
	}

	public String toString() {
		return "A_" + super.toString();
	}
}
