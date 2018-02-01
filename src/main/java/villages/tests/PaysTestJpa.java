package villages.tests;

import application.Application;
import villages.dao.PaysDao;
import villages.model.Pays;

public class PaysTestJpa {

	public static void main(String[] args) {

		// PaysDao paysDao = Application.getInstance().getPaysDao();
		PaysDao paysDao = Application.getInstance().getPaysDao();

		Pays france = new Pays("CODE", "libellexxx");
		Application.getInstance().getPaysDao().create(france);
		
		france.setCode("codeFrance");
		
		Application.getInstance().getPaysDao().update(france);
		
		
	}
}