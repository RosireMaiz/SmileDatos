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

import ve.smile.enums.OperacionEnum;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "tb_vista_operacion_basico")
@Entity
public class VistaOperacionBasico {

	private Integer idVistaOperacionBasico;
	private IconSclass fkIconSclass;
	private MetodoDao fkMetodoDao;
	private Vista fkVista;
	private Sclass fkSclass;
	private Integer operacion;
	private String tooltiptext;
	private String nombre;

	public VistaOperacionBasico() {
		super();
	}

	public VistaOperacionBasico(Integer idVistaOperacionBasico) {
		super();
		this.idVistaOperacionBasico = idVistaOperacionBasico;
	}

	public VistaOperacionBasico(
			IconSclass fkIconSclass,
			MetodoDao fkMetodoDao,
			Vista fkVista,
			Sclass fkSclass,
			Integer operacion,
			String tooltiptext,
			String nombre) {
		super();
		this.fkIconSclass = fkIconSclass;
		this.fkMetodoDao = fkMetodoDao;
		this.fkVista = fkVista;
		this.fkSclass = fkSclass;
		this.operacion = operacion;
		this.tooltiptext = tooltiptext;
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_vista_operacion_basico_sequence", sequenceName = "public.tb_vista_operacion_basico_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_vista_operacion_basico_sequence")
	@Column(name="id_vista_operacion_basico")
	public Integer getIdVistaOperacionBasico() {
		return idVistaOperacionBasico;
	}

	public void setIdVistaOperacionBasico(Integer idVistaOperacionBasico) {
		this.idVistaOperacionBasico = idVistaOperacionBasico;
	}

	@ManyToOne
	@JoinColumn(name = "fk_icon_sclass", nullable = false)
	public IconSclass getFkIconSclass() {
		return fkIconSclass;
	}

	public void setFkIconSclass(IconSclass fkIconSclass) {
		this.fkIconSclass = fkIconSclass;
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
	@JoinColumn(name = "fk_vista", nullable = false)
	public Vista getFkVista() {
		return fkVista;
	}

	public void setFkVista(Vista fkVista) {
		this.fkVista = fkVista;
	}

	@ManyToOne
	@JoinColumn(name = "fk_sclass", nullable = false)
	public Sclass getFkSclass() {
		return fkSclass;
	}

	public void setFkSclass(Sclass fkSclass) {
		this.fkSclass = fkSclass;
	}

	@Column(name="operacion")
	public Integer getOperacion() {
		return operacion;
	}

	public void setOperacion(Integer operacion) {
		this.operacion = operacion;
	}

	@JsonIgnore
	public OperacionEnum getOperacionEnum() {
		return OperacionEnum.values()[this.operacion];
	}

	public void setOperacionEnum(OperacionEnum operacionEnum) {
		this.operacion = operacionEnum.ordinal();
	}

	@Column(name="tooltiptext")
	public String getTooltiptext() {
		return tooltiptext;
	}

	public void setTooltiptext(String tooltiptext) {
		this.tooltiptext = tooltiptext;
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
		result = prime * result + ((idVistaOperacionBasico == null) ? 0 : idVistaOperacionBasico.hashCode());
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
		VistaOperacionBasico other = (VistaOperacionBasico) obj;
		if (idVistaOperacionBasico == null) {
			return false;
		} 
		if (!idVistaOperacionBasico.equals(other.idVistaOperacionBasico)) {
			return false;
		} 
		return true;
	}

}
