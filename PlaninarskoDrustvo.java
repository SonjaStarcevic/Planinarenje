package whatGoesUp;

import java.util.LinkedList;

public class PlaninarskoDrustvo {
	private String naziv;
	private final int gOs;
	private LinkedList<Planinar> clanovi = new LinkedList<Planinar>();
	private LinkedList<Planinar> rangLista = new LinkedList<Planinar>();
	private int brClanova;

	public PlaninarskoDrustvo(String naziv, int gOs) {
		super();
		this.naziv = naziv;
		this.gOs = gOs;
	}

	public PlaninarskoDrustvo(String naziv, int gOs, Planinar osnivac) {
		super();
		this.naziv = naziv;
		this.gOs = gOs;
		clanovi.add(0, osnivac);
		brClanova++;
	}

	public PlaninarskoDrustvo(String naziv, int gOs, Planinar[] osnivaci) { // za slucaj da se prosledjuje niz osnivaca
		super();
		this.naziv = naziv;
		this.gOs = gOs;
		int poz = 0;
		for (int i = 0; i < osnivaci.length; i++) {
			clanovi.add(poz++, osnivaci[i]);
			brClanova++;
		}
	}

	public PlaninarskoDrustvo(String naziv, int gOs, LinkedList<Planinar> osnivaci) { // za slucaj da se prosledjuje
																						// lista osnivaca
		super();
		this.naziv = naziv;
		this.gOs = gOs;
		int poz = 0;
		for (Planinar p : osnivaci) {
			clanovi.add(poz++, p);
			brClanova++;
		}
	}

	public void postaviOsnivaca(Planinar osnivac) {
		clanovi.add(0, osnivac);
		brClanova++;
	}

	public void postaviOsnivaca(Planinar[] osnivaci) {
		int poz = 0;
		for (int i = 0; i < osnivaci.length; i++) {
			clanovi.add(poz++, osnivaci[i]);
			brClanova++;
		}
	}

	public void postaviOsnivaca(LinkedList<Planinar> osnivaci) {
		int poz = 0;
		for (Planinar p : osnivaci) {
			clanovi.add(poz++, p);
			brClanova++;
		}
	}

	public void uclani(Planinar p) {
		clanovi.add(p);
		brClanova++;
	}

	public Planinar getPlaninar(int poz) {
		return clanovi.get(poz - 1);
	}

	public int getBrClanova() {
		return brClanova;
	}

	public void rangiranje() {
		for (Planinar p : clanovi)
			rangLista.add(p);
		for (Planinar p : rangLista)
			p.saberiVisinu();

		for (int i = 0; i < brClanova - 1; i++) {
			Planinar max = rangLista.get(i);
			int poz = i;
			for (int j = i + 1; j < brClanova; j++) {
				if (rangLista.get(j).getUkupnaVisina() > max.getUkupnaVisina()) {
					max = rangLista.get(j);
					poz = j;
				}
			}
			rangLista.set(poz, rangLista.get(i));
			rangLista.set(i, max);
		}
		String s = "\nRANG LISTA:";
		int poz = 1;
		for (Planinar p : rangLista) {
			s += "\n\t#" + poz + " " + p + " " + p.getUkupnaVisina();
			poz++;
		}
		System.out.println(s);
	}

	public String toString() {
		String s = naziv + "(osnovano " + gOs + ")\nCLANOVI:";
		for (Planinar p : clanovi)
			s += "\n\t" + p;
		return s;
	}

}
