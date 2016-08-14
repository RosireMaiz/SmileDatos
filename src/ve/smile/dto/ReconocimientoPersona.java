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

@Table(name = "tb_reconocimiento_persona")
@Entity
public class ReconocimientoPersona {

	private Integer idReconocimientoPersona;
	private Persona fkPersona;
	private Multimedia fkMultimedia;
	private ClasificadorReconocimiento fkClasificadorReconocimiento;
	private String contenido;

	public ReconocimientoPersona() {
		super();
	}

	public ReconocimientoPersona(Integer idReconocimientoPersona) {
		super();
		this.idReconocimientoPersona = idReconocimientoPersona;
	}

	public ReconocimientoPersona(
			Persona fkPersona,
			Multimedia fkMultimedia,
			ClasificadorReconocimiento fkClasificadorReconocimiento,
			String contenido) {
		super();
		this.fkPersona = fkPersona;
		this.fkMultimedia = fkMultimedia;
		this.fkClasificadorReconocimiento = fkClasificadorReconocimiento;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_reconocimiento_persona_sequence", sequenceName = "public.tb_reconocimiento_persona_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_reconocimiento_persona_sequence")
	@Column(name="id_reconocimiento_persona")
	public Integer getIdReconocimientoPersona() {
		return idReconocimientoPersona;
	}

	public void setIdReconocimientoPersona(Integer idReconocimientoPersona) {
		this.idReconocimientoPersona = idReconocimientoPersona;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
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
	@JoinColumn(name = "fk_clasificador_reconocimiento", nullable = false)
	public ClasificadorReconocimiento getFkClasificadorReconocimiento() {
		return fkClasificadorReconocimiento;
	}

	public void setFkClasificadorReconocimiento(ClasificadorReconocimiento fkClasificadorReconocimiento) {
		this.fkClasificadorReconocimiento = fkClasificadorReconocimiento;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idReconocimientoPersona == null) ? 0 : idReconocimientoPersona.hashCode());
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
		ReconocimientoPersona other = (ReconocimientoPersona) obj;
		if (idReconocimientoPersona == null) {
			return false;
		} 
		if (!idReconocimientoPersona.equals(other.idReconocimientoPersona)) {
			return false;
		} 
		return true;
	}

}
