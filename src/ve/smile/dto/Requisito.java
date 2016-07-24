package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_requisito")
@Entity
public class Requisito {

	private Integer idRequisito;
	private String nombre;
	private String descripcion;

	public Requisito() {
		super();
	}

	public Requisito(Integer idRequisito) {
		super();
		this.idRequisito = idRequisito;
	}

	public Requisito(
			String nombre,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Id
	@SequenceGenerator(name = "tb_requisito_sequence", sequenceName = "public.tb_requisito_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_requisito_sequence")
	@Column(name="id_requisito")
	public Integer getIdRequisito() {
		return idRequisito;
	}

	public void setIdRequisito(Integer idRequisito) {
		this.idRequisito = idRequisito;
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
		result = prime * result + ((idRequisito == null) ? 0 : idRequisito.hashCode());
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
		Requisito other = (Requisito) obj;
		if (idRequisito == null) {
			return false;
		} 
		if (!idRequisito.equals(other.idRequisito)) {
			return false;
		} 
		return true;
	}

}
