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

@Table(name = "tb_cartelera")
@Entity
public class Cartelera {

	private Integer idCartelera;
	private ClasificadorCartelera fkClasificadorCartelera;
	private Multimedia fkMultimedia;
	private Etiqueta fkEtiqueta;
	private String titulo;
	private String descripcion;
	private Long fechaInicio;
	private Long fechaFinalizacion;
	private Long fechaCreacion;

	public Cartelera() {
		super();
	}

	public Cartelera(Integer idCartelera) {
		super();
		this.idCartelera = idCartelera;
	}

	public Cartelera(
			ClasificadorCartelera fkClasificadorCartelera,
			Multimedia fkMultimedia,
			Etiqueta fkEtiqueta,
			String titulo,
			String descripcion,
			Long fechaInicio,
			Long fechaFinalizacion,
			Long fechaCreacion) {
		super();
		this.fkClasificadorCartelera = fkClasificadorCartelera;
		this.fkMultimedia = fkMultimedia;
		this.fkEtiqueta = fkEtiqueta;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.fechaCreacion = fechaCreacion;
	}

	@Id
	@SequenceGenerator(name = "tb_cartelera_sequence", sequenceName = "public.tb_cartelera_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_cartelera_sequence")
	@Column(name="id_cartelera")
	public Integer getIdCartelera() {
		return idCartelera;
	}

	public void setIdCartelera(Integer idCartelera) {
		this.idCartelera = idCartelera;
	}

	@ManyToOne
	@JoinColumn(name = "fk_clasificador_cartelera", nullable = false)
	public ClasificadorCartelera getFkClasificadorCartelera() {
		return fkClasificadorCartelera;
	}

	public void setFkClasificadorCartelera(ClasificadorCartelera fkClasificadorCartelera) {
		this.fkClasificadorCartelera = fkClasificadorCartelera;
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
	@JoinColumn(name = "fk_etiqueta", nullable = false)
	public Etiqueta getFkEtiqueta() {
		return fkEtiqueta;
	}

	public void setFkEtiqueta(Etiqueta fkEtiqueta) {
		this.fkEtiqueta = fkEtiqueta;
	}

	@Column(name="titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name="descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name="fecha_inicio")
	public Long getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Long fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name="fecha_finalizacion")
	public Long getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Long fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	@Column(name="fecha_creacion")
	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCartelera == null) ? 0 : idCartelera.hashCode());
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
		Cartelera other = (Cartelera) obj;
		if (idCartelera == null) {
			return false;
		} 
		if (!idCartelera.equals(other.idCartelera)) {
			return false;
		} 
		return true;
	}

}
