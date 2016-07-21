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

@Table(name = "tb_meta")
@Entity
public class Meta {

	private Integer idMeta;
	private Indicador fkIndicador;
	private String nombre;
	private String descripcion;

	public Meta() {
		super();
	}

	public Meta(Integer idMeta) {
		super();
		this.idMeta = idMeta;
	}

	public Meta(
			Indicador fkIndicador,
			String nombre,
			String descripcion) {
		super();
		this.fkIndicador = fkIndicador;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_meta_sequence", sequenceName = "public.tb_meta_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_meta_sequence")
	@Column(name="id_meta")
	public Integer getIdMeta() {
		return idMeta;
	}

	public void setIdMeta(Integer idMeta) {
		this.idMeta = idMeta;
	}

	@ManyToOne
	@JoinColumn(name = "fk_indicador", nullable = false)
	public Indicador getFkIndicador() {
		return fkIndicador;
	}

	public void setFkIndicador(Indicador fkIndicador) {
		this.fkIndicador = fkIndicador;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMeta == null) ? 0 : idMeta.hashCode());
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
		Meta other = (Meta) obj;
		if (idMeta == null) {
			return false;
		} 
		if (!idMeta.equals(other.idMeta)) {
			return false;
		} 
		return true;
	}

}
