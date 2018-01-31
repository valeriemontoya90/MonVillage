package villages.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import villages.model.Ville;

public class VilleDaoJpa implements VilleDao {

	@Override
	public Ville find(Integer id) {
		Ville adresse = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			adresse = em.find(Adresse.class, id);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {

			if (em != null) {
				em.close();
			}
		}
		return adresse;
	}

	@Override
	public List<Ville> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Ville obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ville update(Ville obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Ville obj) {
		// TODO Auto-generated method stub
		
	}

}
