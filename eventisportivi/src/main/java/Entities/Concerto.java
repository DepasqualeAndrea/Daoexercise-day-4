package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import Enum.Genere;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
public class Concerto extends Evento {
	private Genere genere;
	private Boolean inStreaming;

	public Concerto(Genere genere, Boolean inStreaming) {
		super();
		this.genere = genere;
		this.inStreaming = inStreaming;
	}

	@Override
	public String toString() {
		return "Concerto [genere=" + genere + ", inStreaming=" + inStreaming + "]";
	}

}
