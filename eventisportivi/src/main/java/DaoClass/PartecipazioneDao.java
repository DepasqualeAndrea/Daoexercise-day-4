package DaoClass;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Entities.Partecipazione;

public class PartecipazioneDao {
	private final EntityManager em;

	public PartecipazioneDao(EntityManager em) {
		this.em = em;
	}
//metodo save

	public void savePartecipazione(Partecipazione ev) {
		EntityTransaction e = em.getTransaction();
		e.begin();
		em.persist(ev);
		e.commit();
		System.out.println("Partecipazione salvato correttamente");
	}

//metodo find	

	public Partecipazione findPartecipazioneById(UUID id) {

		Partecipazione trova = em.find(Partecipazione.class, id);
		return trova;
	}

//metodo delete

	public void findByIdAndDelete(UUID id) {
		Partecipazione trova = em.find(Partecipazione.class, id);
		if (trova != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(trova);
			t.commit();
			System.out.println("Partecipazione eliminata con successo");
		} else {
			System.out.println("Partecipazione non trovata");
		}
	}
}
