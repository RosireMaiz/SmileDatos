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

@Table(name = "tb_sugerencia")
@Entity
public class Sugerencia {

	private Integer idSugerencia;
	private Comunidad fkComunidad;
	private String contenido;
	private String asunto;
	private Long fecha;
	private Character estatus;

	public Sugerencia() {
		super();
	}

	public Sugerencia(Integer idSugerencia) {
		super();
		this.idSugerencia = idSugerencia;
	}

	public Sugerencia(
			Comunidad fkComunidad,
			String contenido,
			String asunto,
			Long fecha,
			Character estatus) {
		super();
		this.fkComunidad = fkComunidad;
		this.contenido = contenido;
		this.asunto = asunto;
		this.fecha = fecha;
		this.estatus = estatus;
	}

	@Id
	@SequenceGenerator(name = "tb_sugerencia_sequence", sequenceName = "public.tb_sugerencia_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_sugerencia_sequence")
	@Column(name="id_sugerencia")
	public Integer getIdSugerencia() {
		return idSugerencia;
	}

	public void setIdSugerencia(Integer idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	@ManyToOne
	@JoinColumn(name = "fk_comunidad", nullable = false)
	public Comunidad getFkComunidad() {
		return fkComunidad;
	}

	public void setFkComunidad(Comunidad fkComunidad) {
		this.fkComunidad = fkComunidad;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Column(name="asunto")
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Column(name="estatus")
	public Character getEstatus() {
		return estatus;
	}

	public void setEstatus(Character estatus) {
		this.estatus = estatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSugerencia == null) ? 0 : idSugerencia.hashCode());
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
		Sugerencia other = (Sugerencia) obj;
		if (idSugerencia == null) {
			return false;
		} 
		if (!idSugerencia.equals(other.idSugerencia)) {
			return false;
		} 
		return true;
	}

}
