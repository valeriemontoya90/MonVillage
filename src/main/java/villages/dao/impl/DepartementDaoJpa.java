package villages.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import application.Application;
import villages.dao.DepartementDao;
import villages.model.Departement;

public class DepartementDaoJpa implements DepartementDao {

	@Override
	public Departement find(Integer id) {
		Departement departement = null;
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			departement = em.find(Departement.class, id);

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
		return departement;
	}

	@Override
	public List<Departement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Departement obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			em.persist(obj);
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
	}

	@Override
	public Departement update(Departement obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Departement obj) {
		// TODO Auto-generated method stub

	}

}
