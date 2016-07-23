package ve.smile.seguridad.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import ve.smile.seguridad.enums.AccionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_auditoria")
@Entity
public class Auditoria {

	private Integer idAuditoria;
	private Sesion fkSesion;
	private Tabla fkTabla;
	private Integer accion;
	private MetodoDao fkMetodoDao;
	private MetodoDao fkMetodoDaoRaiz;
	private Integer registroId;
	private String datos;
	private Long fecha;

	public Auditoria() {
		super();
	}

	public Auditoria(Integer idAuditoria) {
		super();
		this.idAuditoria = idAuditoria;
	}

	public Auditoria(
			Sesion fkSesion,
			Tabla fkTabla,
			Integer accion,
			MetodoDao fkMetodoDao,
			MetodoDao fkMetodoDaoRaiz,
			Integer registroId,
			String datos,
			Long fecha) {
		super();
		this.fkSesion = fkSesion;
		this.fkTabla = fkTabla;
		this.accion = accion;
		this.fkMetodoDao = fkMetodoDao;
		this.fkMetodoDaoRaiz = fkMetodoDaoRaiz;
		this.registroId = registroId;
		this.datos = datos;
		this.fecha = fecha;
	}

	@Id
	@SequenceGenerator(name = "tb_auditoria_sequence", sequenceName = "public.tb_auditoria_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_auditoria_sequence")
	@Column(name="id_auditoria")
	public Integer getIdAuditoria() {
		return idAuditoria;
	}

	public void setIdAuditoria(Integer idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	@ManyToOne
	@JoinColumn(name = "fk_sesion", nullable = false)
	public Sesion getFkSesion() {
		return fkSesion;
	}

	public void setFkSesion(Sesion fkSesion) {
		this.fkSesion = fkSesion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_tabla", nullable = false)
	public Tabla getFkTabla() {
		return fkTabla;
	}

	public void setFkTabla(Tabla fkTabla) {
		this.fkTabla = fkTabla;
	}

	@Column(name="accion")
	public Integer getAccion() {
		return accion;
	}

	public void setAccion(Integer accion) {
		this.accion = accion;
	}
	
	@JsonIgnore
	@Transient
	public AccionEnum getAccionEnum() {
		return AccionEnum.values()[this.accion];
	}

	public void setAccionEnum(AccionEnum accionEnum) {
		this.accion = accionEnum.ordinal();
	}

	@ManyToOne
	@JoinColumn(name = "fk_metodo_dao", nullable = false)
	public MetodoDao getFkMetodoDao() {
		return fkMetodoDao;
	}

	public void setFkMetodoDao(MetodoDao fkMetodoDao) {
		this.fkMetodoDao = fkMetodoDao;
	}

	@ManyToOne
	@JoinColumn(name = "fk_metodo_dao_raiz", nullable = false)	
	public MetodoDao getFkMetodoDaoRaiz() {
		return fkMetodoDaoRaiz;
	}

	public void setFkMetodoDaoRaiz(MetodoDao fkMetodoDaoRaiz) {
		this.fkMetodoDaoRaiz = fkMetodoDaoRaiz;
	}

	@Column(name="registro_id")
	public Integer getRegistroId() {
		return registroId;
	}

	public void setRegistroId(Integer registroId) {
		this.registroId = registroId;
	}

	@Column(name="datos")
	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAuditoria == null) ? 0 : idAuditoria.hashCode());
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
		Auditoria other = (Auditoria) obj;
		if (idAuditoria == null) {
			return false;
		} 
		if (!idAuditoria.equals(other.idAuditoria)) {
			return false;
		} 
		return true;
	}

}
