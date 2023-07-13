package DaoClass;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Entities.PartitaDiCalcio;

public class CalcioDao {
	private final EntityManager em;

	public CalcioDao(EntityManager em) {
		this.em = em;
	}
//metodo save

	public void saveEventCalcio(PartitaDiCalcio ev) {
		EntityTransaction e = em.getTransaction();
		e.begin();
		em.persist(ev);
		e.commit();
		System.out.println("PartitaDiCalcio salvata correttamente");
	}

//metodo find	

	public PartitaDiCalcio findEventCalcioById(UUID id) {

		PartitaDiCalcio trova = em.find(PartitaDiCalcio.class, id);
		return trova;
	}

//metodo delete

	public void findCalcioByIdAndDelete(UUID id) {
		PartitaDiCalcio trova = em.find(PartitaDiCalcio.class, id);
		if (trova != null) {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.remove(trova);
			t.commit();
			System.out.println("PartitaDiCalcio eliminata con successo");
		} else {
			System.out.println("PartitaDiCalcio non trovata");
		}
	}
}
