package DaoClass;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Entities.GaraDiAtletica;

public class AtleticaDao {
	private final EntityManager em;

	public AtleticaDao(EntityManager em) {
		this.em = em;
	}
//metodo save

	public void saveAtletica(GaraDiAtletica ev) {
		EntityTransaction e = em.getTransaction();
		e.begin();
		em.persist(ev);
		e.commit();
		System.out.println("GaraDiAtletica salvato correttamente");
	}

//metodo find	

	public GaraDiAtletica findAtleticaById(UUID id) {

		GaraDiAtletica trova = em.find(GaraDiAtletica.class, id);
		return trova;
	}

//metodo delete

	public void findAtleticaByIdAndDelete(UUID id) {
		GaraDiAtletica trova = em.find(GaraDiAtletica.class, id);
		if (trova != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(trova);
			t.commit();
			System.out.println("Atletica eliminato con successo");
		} else {
			System.out.println("Atletica non trovato");
		}
	}
}
