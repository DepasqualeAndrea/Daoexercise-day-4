package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
public class PartitaDiCalcio extends Evento {
	private String Squadra_di_casa;
	private String Squadra_ospite;
	private String SquadraVincente;
	private int Gol_Squadra_Di_Casa;
	private int Gol_Squadra_Ospite;

	public PartitaDiCalcio(String titolo, String descrizione, long numeroMassimoPartecipanti, String squadra_di_casa,
			String squadra_ospite, String squadraVincente, int gol_Squadra_Di_Casa, int gol_Squadra_Ospite) {
		super(titolo, descrizione, numeroMassimoPartecipanti);
		Squadra_di_casa = squadra_di_casa;
		Squadra_ospite = squadra_ospite;
		SquadraVincente = squadraVincente;
		Gol_Squadra_Di_Casa = gol_Squadra_Di_Casa;
		Gol_Squadra_Ospite = gol_Squadra_Ospite;
	}

	@Override
	public String toString() {
		return "PartitaDiCalcio [Squadra_di_casa=" + Squadra_di_casa + ", Squadra_ospite=" + Squadra_ospite
				+ ", SquadraVincente=" + SquadraVincente + ", Gol_Squadra_Di_Casa=" + Gol_Squadra_Di_Casa
				+ ", Gol_Squadra_Ospite=" + Gol_Squadra_Ospite + "]";
	}

}
