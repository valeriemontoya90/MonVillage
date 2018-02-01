package tests;

import application.Application;
import villages.dao.DepartementDao;
import villages.model.Departement;

public class TestVilleJpa {

	public static void main(String[] args) {

		DepartementDao departementDao = Application.getInstance().getDepartementDao();
		Departement dpt1 = new Departement();
		dpt1.setCode("un code");
		dpt1.setLibelle("un libelle");
		departementDao.create(dpt1);

	}

}
