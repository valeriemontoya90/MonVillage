package application;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import villages.dao.PaysDao;
import villages.dao.impl.PaysDaoJpa;

public class Application {
	private static Application instance = null;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("villages");

	private final PaysDao paysDao = new PaysDaoJpa();

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}
	
	public PaysDao getPaysDao() {
		return paysDao;
	}
	
//	public static void stop() {
//		Application inst = getInstance();
//		inst.PaysDao = null;
//		//inst.ligneCommandeDao = null; // Modèle
//		inst.emf.close();
//		inst.emf = null;
//	}

	public EntityManagerFactory getEmf() {
		return emf;
	}	
}
