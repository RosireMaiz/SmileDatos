package ve.smile.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_participacion")
@Entity
public class Participacion {

	private Integer idParticipacion;
	private Multimedia fkMultimedia;
	private String nombre;
	private String descripcion;

	private List<Requisito> requisitos;

	public Participacion() {
		super();
	}

	public Participacion(Integer idParticipacion) {
		super();
		this.idParticipacion = idParticipacion;
	}

	public Participacion(Multimedia fkMultimedia, String nombre,
			String descripcion) {
		super();
		this.fkMultimedia = fkMultimedia;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_participacion_sequence", sequenceName = "public.tb_participacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_participacion_sequence")
	@Column(name = "id_participacion")
	public Integer getIdParticipacion() {
		return idParticipacion;
	}

	public void setIdParticipacion(Integer idParticipacion) {
		this.idParticipacion = idParticipacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = true)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToMany
	@JoinTable(name = "tb_requisito_participacion", joinColumns = @JoinColumn(name = "fk_participacion"), inverseJoinColumns = @JoinColumn(name = "fk_requisito"))
	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<Requisito> requisitos) {
		this.requisitos = requisitos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idParticipacion == null) ? 0 : idParticipacion.hashCode());
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
		Participacion other = (Participacion) obj;
		if (idParticipacion == null) {
			return false;
		}
		if (!idParticipacion.equals(other.idParticipacion)) {
			return false;
		}
		return true;
	}

}
