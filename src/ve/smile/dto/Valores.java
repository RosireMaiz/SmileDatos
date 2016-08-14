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

@Table(name = "tb_valores")
@Entity
public class Valores {

	private Integer idValores;
	private String nombre;
	private Multimedia fkMultimedia;
	private Organizacion fkOrganizacion;

	public Valores() {
		super();
	}

	public Valores(Integer idValores) {
		super();
		this.idValores = idValores;
	}

	public Valores(
			String nombre,
			Multimedia fkMultimedia,
			Organizacion fkOrganizacion) {
		super();
		this.nombre = nombre;
		this.fkMultimedia = fkMultimedia;
		this.fkOrganizacion = fkOrganizacion;
	}

	@Id
	@SequenceGenerator(name = "tb_valores_sequence", sequenceName = "public.tb_valores_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_valores_sequence")
	@Column(name="id_valores")
	public Integer getIdValores() {
		return idValores;
	}

	public void setIdValores(Integer idValores) {
		this.idValores = idValores;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne
	@JoinColumn(name = "fk_multimedia", nullable = false)
	public Multimedia getFkMultimedia() {
		return fkMultimedia;
	}

	public void setFkMultimedia(Multimedia fkMultimedia) {
		this.fkMultimedia = fkMultimedia;
	}

	@ManyToOne
	@JoinColumn(name = "fk_organizacion", nullable = false)
	public Organizacion getFkOrganizacion() {
		return fkOrganizacion;
	}

	public void setFkOrganizacion(Organizacion fkOrganizacion) {
		this.fkOrganizacion = fkOrganizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idValores == null) ? 0 : idValores.hashCode());
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
		Valores other = (Valores) obj;
		if (idValores == null) {
			return false;
		} 
		if (!idValores.equals(other.idValores)) {
			return false;
		} 
		return true;
	}

}
