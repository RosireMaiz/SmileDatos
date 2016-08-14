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

import ve.smile.enums.TipoDifusionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_difusion")
@Entity
public class Difusion {

	private Integer idDifusion;
	private Long fecha;
	private Persona fkPersona;
	private String asunto;
	private String contenido;
	private Integer tipoDifusion;
	private String destinatario;

	public Difusion() {
		super();
	}

	public Difusion(Integer idDifusion) {
		super();
		this.idDifusion = idDifusion;
	}

	public Difusion(
			Long fecha,
			Persona fkPersona,
			String asunto,
			String contenido,
			Integer tipoDifusion,
			String destinatario) {
		super();
		this.fecha = fecha;
		this.fkPersona = fkPersona;
		this.asunto = asunto;
		this.contenido = contenido;
		this.tipoDifusion = tipoDifusion;
		this.destinatario = destinatario;
	}

	@Id
	@SequenceGenerator(name = "tb_difusion_sequence", sequenceName = "public.tb_difusion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_difusion_sequence")
	@Column(name="id_difusion")
	public Integer getIdDifusion() {
		return idDifusion;
	}

	public void setIdDifusion(Integer idDifusion) {
		this.idDifusion = idDifusion;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@ManyToOne
	@JoinColumn(name = "fk_persona", nullable = false)
	public Persona getFkPersona() {
		return fkPersona;
	}

	public void setFkPersona(Persona fkPersona) {
		this.fkPersona = fkPersona;
	}

	@Column(name="asunto")
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@Column(name="contenido")
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Column(name="tipo_difusion")
	public Integer getTipoDifusion() {
		return tipoDifusion;
	}

	public void setTipoDifusion(Integer tipoDifusion) {
		this.tipoDifusion = tipoDifusion;
	}

	@JsonIgnore
	public TipoDifusionEnum getTipoDifusionEnum() {
		return TipoDifusionEnum.values()[this.tipoDifusion];
	}

	public void setTipoDifusionEnum(TipoDifusionEnum tipoDifusionEnum) {
		this.tipoDifusion = tipoDifusionEnum.ordinal();
	}

	@Column(name="destinatario")
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDifusion == null) ? 0 : idDifusion.hashCode());
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
		Difusion other = (Difusion) obj;
		if (idDifusion == null) {
			return false;
		} 
		if (!idDifusion.equals(other.idDifusion)) {
			return false;
		} 
		return true;
	}

}
