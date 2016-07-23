package ve.smile.seguridad.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_metodo_dao")
@Entity
public class MetodoDao {

	private Integer idMetodoDao;
	private String nombre;

	public MetodoDao() {
		super();
	}

	public MetodoDao(Integer idMetodoDao) {
		super();
		this.idMetodoDao = idMetodoDao;
	}

	public MetodoDao(
			String nombre) {
		super();
		this.nombre = nombre;
	}

	@Id
	@SequenceGenerator(name = "tb_metodo_dao_sequence", sequenceName = "public.tb_metodo_dao_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_metodo_dao_sequence")
	@Column(name="id_metodo_dao")
	public Integer getIdMetodoDao() {
		return idMetodoDao;
	}

	public void setIdMetodoDao(Integer idMetodoDao) {
		this.idMetodoDao = idMetodoDao;
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
		result = prime * result + ((idMetodoDao == null) ? 0 : idMetodoDao.hashCode());
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
		MetodoDao other = (MetodoDao) obj;
		if (idMetodoDao == null) {
			return false;
		} 
		if (!idMetodoDao.equals(other.idMetodoDao)) {
			return false;
		} 
		return true;
	}

}
