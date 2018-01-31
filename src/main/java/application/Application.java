package application;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Application {
	private static Application instance = null;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("villages");
	
	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}
	
	public static void stop() {
		Application inst = getInstance();
		//inst.ligneCommandeDao = null; // Modèle
		inst.emf.close();
		inst.emf = null;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}	
}
