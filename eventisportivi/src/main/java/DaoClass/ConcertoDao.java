package DaoClass;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Entities.Concerto;

public class ConcertoDao {
	private final EntityManager em;

	public ConcertoDao(EntityManager em) {
		this.em = em;
	}
//metodo save

	public void saveConcertoEvent(Concerto ev) {
		EntityTransaction e = em.getTransaction();
		e.begin();
		em.persist(ev);
		e.commit();
		System.out.println("Concerto salvato correttamente");
	}

//metodo find	

	public Concerto findConcertoEventById(UUID id) {

		Concerto trova = em.find(Concerto.class, id);
		return trova;
	}

//metodo delete

	public void findConcertoByIdAndDelete(UUID id) {
		Concerto trova = em.find(Concerto.class, id);
		if (trova != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(trova);
			t.commit();
			System.out.println("Concerto eliminato con successo");
		} else {
			System.out.println("Concerto non trovato");
		}
	}
}
