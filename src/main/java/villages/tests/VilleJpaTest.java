package villages.tests;

import java.util.List;

import application.Application;
import villages.dao.VilleDao;
import villages.model.Ville;

public class VilleJpaTest {
	public static void main(String[] args) {
		VilleDao villeDao = Application.getInstance().getVilleDao();

		Ville paris = new Ville("Paris", "France");
		villeDao.create(paris);
		System.out.println(paris);

		Ville venise = new Ville("Venise", "Italie");
		villeDao.create(venise);
		System.out.println(venise);

		Ville villeFind = villeDao.find(paris.getId());
		villeFind.setPays("FR");
		villeDao.update(villeFind);
		
		List<Ville> villes = villeDao.findAll();
		for (Ville ville : villes) {
			System.out.println(ville);
		}
		
		villeDao.delete(venise);
	}
}
