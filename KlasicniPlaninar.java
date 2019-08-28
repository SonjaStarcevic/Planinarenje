package whatGoesUp;

public class KlasicniPlaninar extends Planinar {
	private int V = 2000;

	public KlasicniPlaninar(String ime, int kapacitet) {
		super(ime, kapacitet);
	}

	@Override
	public boolean uspesno(Uspon u) {
		if (u.getPlanina().getVisina() < V)
			return true;
		else
			return false;
	}

	public String toString() {
		return "K_" + super.toString();
	}
}
