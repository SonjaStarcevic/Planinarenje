package whatGoesUp;

import java.util.Date;

public abstract class Planinar {
	public static int ID = 1;
	private String ime;
	private Uspon[] zbirka;
	private int brUspona = 0;
	private int ukupnaVisina;
	private int id;

	public Planinar(String ime, int kapacitet) {
		this.ime = ime;
		zbirka = new Uspon[kapacitet];
		id = ID++;
	}

	public void dodajUspon(Planina p) {
		Uspon u = new Uspon(p);
		if (uspesno(u) == true) {
			if (brUspona < zbirka.length) {
				zbirka[brUspona++] = u;
				System.out.println(this.toString() + " - USPEH");
			} else {
				System.err.println("Popunili ste zbirku.");
			}
		} else {
			System.out.println(this.toString() + " - NEUSPEH");
		}
	}

	public abstract boolean uspesno(Uspon u);

	public String ispisZbirke() {
		String s = "";
		for (int i = 0; i < brUspona; i++) {
			if (i != 0)
				s += ", ";
			s += zbirka[i].getPlanina();
		}
		return s;
	}

	public void saberiVisinu() {
		Date danas = new Date();
		long odDanas = danas.getTime();
		long mesec = 31 * 24 * 60 * 60 * 1000l;

		for (int i = 0; i < brUspona; i++) {
			long odUspona = zbirka[i].getDatum().getTime();
			if (odDanas - odUspona < mesec) {
				ukupnaVisina += zbirka[i].getPlanina().getVisina();
				if (zbirka[i].getPlanina().getVisina() > 1800)
					ukupnaVisina += 300;
			}
		}
	}

	public int getUkupnaVisina() {
		return ukupnaVisina;
	}

	public String toString() {
		return ime + "-" + id + " (" + ispisZbirke() + ")";
	}
}
