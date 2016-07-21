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

@Table(name = "tb_frecuencia_aporte")
@Entity
public class FrecuenciaAporte {

	private Integer idFrecuenciaAporte;
	private UnidadMedida fkUnidadMedida;
	private String nombre;
	private Integer frecuencia;

	public FrecuenciaAporte() {
		super();
	}

	public FrecuenciaAporte(Integer idFrecuenciaAporte) {
		super();
		this.idFrecuenciaAporte = idFrecuenciaAporte;
	}

	public FrecuenciaAporte(
			UnidadMedida fkUnidadMedida,
			String nombre,
			Integer frecuencia) {
		super();
		this.fkUnidadMedida = fkUnidadMedida;
		this.nombre = nombre;
		this.frecuencia = frecuencia;
	}

	@Id
	@SequenceGenerator(name = "tb_frecuencia_aporte_sequence", sequenceName = "public.tb_frecuencia_aporte_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_frecuencia_aporte_sequence")
	@Column(name="id_frecuencia_aporte")
	public Integer getIdFrecuenciaAporte() {
		return idFrecuenciaAporte;
	}

	public void setIdFrecuenciaAporte(Integer idFrecuenciaAporte) {
		this.idFrecuenciaAporte = idFrecuenciaAporte;
	}

	@ManyToOne
	@JoinColumn(name = "fk_unidad_medida", nullable = false)
	public UnidadMedida getFkUnidadMedida() {
		return fkUnidadMedida;
	}

	public void setFkUnidadMedida(UnidadMedida fkUnidadMedida) {
		this.fkUnidadMedida = fkUnidadMedida;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="frecuencia")
	public Integer getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFrecuenciaAporte == null) ? 0 : idFrecuenciaAporte.hashCode());
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
		FrecuenciaAporte other = (FrecuenciaAporte) obj;
		if (idFrecuenciaAporte == null) {
			return false;
		} 
		if (!idFrecuenciaAporte.equals(other.idFrecuenciaAporte)) {
			return false;
		} 
		return true;
	}

}
