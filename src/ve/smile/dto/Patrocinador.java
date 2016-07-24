package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_patrocinador")
@Entity
public class Patrocinador {

	private Integer idPatrocinador;
	private Persona fkPersona;
	private Long fechaIngreso;
	private Long fechaSalida;

	public Patrocinador() {
		super();
	}

	public Patrocinador(Integer idPatrocinador) {
		super();
		this.idPatrocinador = idPatrocinador;
	}

	public Patrocinador(
			Persona fkPersona,
			Long fechaIngreso,
			Long fechaSalida) {
		super();
		this.fkPersona = fkPersona;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
	}

	@Id
	@SequenceGenerator(name = "tb_patrocinador_sequence", sequenceName = "public.tb_patrocinador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_patrocinador_sequence")
	@Column(name="id_patrocinador")
	public Integer getIdPatrocinador() {
		return idPatrocinador;
	}

	public void setIdPatrocinador(Integer idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="fecha_ingreso")
	public Long getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Long fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Column(name="fecha_salida")
	public Long getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Long fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPatrocinador == null) ? 0 : idPatrocinador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Patrocinador other = (Patrocinador) obj;
		if (idPatrocinador == null) {
			return false;
		} 
		if (!idPatrocinador.equals(other.idPatrocinador)) {
			return false;
		} 
		return true;
	}

}
