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

@Table(name = "tb_indicador")
@Entity
public class Indicador {

	private Integer idIndicador;
	private UnidadMedida fkUnidadMedida;
	private String nombre;

	public Indicador() {
		super();
	}

	public Indicador(Integer idIndicador) {
		super();
		this.idIndicador = idIndicador;
	}

	public Indicador(
			UnidadMedida fkUnidadMedida,
			String nombre) {
		super();
		this.fkUnidadMedida = fkUnidadMedida;
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_indicador_sequence", sequenceName = "public.tb_indicador_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_indicador_sequence")
	@Column(name="id_indicador")
	public Integer getIdIndicador() {
		return idIndicador;
	}

	public void setIdIndicador(Integer idIndicador) {
		this.idIndicador = idIndicador;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIndicador == null) ? 0 : idIndicador.hashCode());
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
		Indicador other = (Indicador) obj;
		if (idIndicador == null) {
			return false;
		} 
		if (!idIndicador.equals(other.idIndicador)) {
			return false;
		} 
		return true;
	}

}
