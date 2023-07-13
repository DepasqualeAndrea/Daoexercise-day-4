package DaoClass;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Entities.Evento;

public class EventoDao {
	private final EntityManager em;

	public EventoDao(EntityManager em) {
		this.em = em;
	}
//metodo save

	public void saveEvent(Evento ev) {
		EntityTransaction e = em.getTransaction();
		e.begin();
		em.persist(ev);
		e.commit();
		System.out.println("Evento salvato correttamente");
	}

//metodo find	

	public Evento findEventById(UUID id) {

		Evento trova = em.find(Evento.class, id);
		return trova;
	}

//metodo delete

	public void findByIdAndDelete(UUID id) {
		Evento trova = em.find(Evento.class, id);
		if (trova != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(trova);
			t.commit();
			System.out.println("Evento eliminato con successo");
		} else {
			System.out.println("Evento non trovato");
		}
	}
}
