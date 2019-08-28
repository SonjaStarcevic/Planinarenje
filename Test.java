package whatGoesUp;

public class Test {

	public static void main(String[] args) {
		Planina montBlan = new Planina("Mont Blan", 4807);
		Planina zlatibor = new Planina("Zlatibor", 1496);
		PlaninarskoDrustvo drustvo = new PlaninarskoDrustvo("Drustvo", 2000,
				new Planinar[] { new Alpinista("Ognjen", 5), new KlasicniPlaninar("Marko", 10) });
		drustvo.uclani(new Alpinista("Zoran", 15));
		drustvo.uclani(new KlasicniPlaninar("Milos", 2));
		drustvo.getPlaninar(1).dodajUspon(montBlan);
		drustvo.getPlaninar(2).dodajUspon(zlatibor);
		if (drustvo.getPlaninar(1) instanceof Alpinista)
			((Alpinista) drustvo.getPlaninar(1)).dodeli(drustvo.getPlaninar(3));
		if (drustvo.getPlaninar(3) instanceof Alpinista)
			((Alpinista) drustvo.getPlaninar(3)).dodeli(drustvo.getPlaninar(1));
		drustvo.getPlaninar(1).dodajUspon(montBlan);
		drustvo.getPlaninar(3).dodajUspon(montBlan);
		drustvo.getPlaninar(3).dodajUspon(zlatibor);
		drustvo.rangiranje();

	}

}
