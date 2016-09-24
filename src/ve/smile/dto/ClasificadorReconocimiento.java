package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.enums.TipoReconocimientoEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "tb_clasificador_reconocimiento")
@Entity
public class ClasificadorReconocimiento {

	private Integer idClasificadorReconocimiento;
	private String nombre;
	private String descripcion;
	private Integer tipoReconocimiento;

	public ClasificadorReconocimiento() {
		super();
	}

	public ClasificadorReconocimiento(Integer idClasificadorReconocimiento) {
		super();
		this.idClasificadorReconocimiento = idClasificadorReconocimiento;
	}

	public ClasificadorReconocimiento(
			String nombre,
			String descripcion,
			Integer tipoReconocimiento) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoReconocimiento = tipoReconocimiento;
	}

	@Id
	@SequenceGenerator(name = "tb_clasificador_reconocimiento_sequence", sequenceName = "public.tb_clasificador_reconocimiento_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_clasificador_reconocimiento_sequence")
	@Column(name="id_clasificador_reconocimiento")
	public Integer getIdClasificadorReconocimiento() {
		return idClasificadorReconocimiento;
	}

	public void setIdClasificadorReconocimiento(Integer idClasificadorReconocimiento) {
		this.idClasificadorReconocimiento = idClasificadorReconocimiento;
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

	@Column(name="tipo_reconocimiento")
	public Integer getTipoReconocimiento() {
		return tipoReconocimiento;
	}

	public void setTipoReconocimiento(Integer tipoReconocimiento) {
		this.tipoReconocimiento = tipoReconocimiento;
	}

	@Transient
	@JsonIgnore
	public TipoReconocimientoEnum getTipoReconocimientoEnum() {
		return TipoReconocimientoEnum.values()[this.tipoReconocimiento];
	}

	public void setTipoReconocimientoEnum(TipoReconocimientoEnum tipoReconocimientoEnum) {
		this.tipoReconocimiento = tipoReconocimientoEnum.ordinal();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClasificadorReconocimiento == null) ? 0 : idClasificadorReconocimiento.hashCode());
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
		ClasificadorReconocimiento other = (ClasificadorReconocimiento) obj;
		if (idClasificadorReconocimiento == null) {
			return false;
		} 
		if (!idClasificadorReconocimiento.equals(other.idClasificadorReconocimiento)) {
			return false;
		} 
		return true;
	}

}
