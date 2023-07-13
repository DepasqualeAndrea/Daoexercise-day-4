package Entities;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "GaraDiAtletica")
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Gara_Atletica")
public class GaraDiAtletica extends Evento {

	@ManyToMany
	private Set<Persona> setAtleti;

	@ManyToOne
	@JoinColumn(name = "GaraAtletica_id", referencedColumnName = "id")
	private Persona vicitore;
}
