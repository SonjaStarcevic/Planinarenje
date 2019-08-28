package whatGoesUp;

import java.util.Date;

public class Uspon {
	private Planina planina;
	private Date datum;

	public Uspon(Planina p) {
		planina = p;
		datum = new Date();
	}

	public Uspon(Planina p, Date d) {
		planina = p; //TODO srediti bag sa zadatim datumom
		datum = d;
	}

	public Planina getPlanina() {
		return planina;
	}

	public Date getDatum() {
		return datum;
	}
}
