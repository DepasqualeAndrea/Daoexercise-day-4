package Entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import Enum.TipoEvento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
public class Evento {
	@Id // genera un id indipendente
	@GeneratedValue // generea un id univoco per ogni evento che abbiamo nel main
	private UUID id;
	private String titolo;
	private String descrizione;
	@Enumerated(EnumType.STRING) // rendere stringa gli enum, altrimenti prendono valore 0/1 ossia vero o falso
	private TipoEvento evento;
	private long numeroMassimoPartecipanti;

	public Evento(String titolo, String descrizione, long numeroMassimoPartecipanti) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", descrizione=" + descrizione
				+ ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}

}
