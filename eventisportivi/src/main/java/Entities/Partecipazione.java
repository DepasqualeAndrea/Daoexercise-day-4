package Entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Partecipazione")
@Getter
@Setter
@NoArgsConstructor
public class Partecipazione {
	@Id
	@GeneratedValue
	private UUID id;
	@Enumerated(EnumType.STRING)
	private Partecipazione partecipazione;

	@Override
	public String toString() {
		return "Partecipazione [id=" + id + ", partecipazione=" + partecipazione + "]";
	}

	public Partecipazione(Partecipazione partecipazione) {
		super();
		this.partecipazione = partecipazione;
	}

}
