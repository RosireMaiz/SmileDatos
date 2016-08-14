package ve.smile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "tb_red_social")
@Entity
public class RedSocial {

	private Integer idRedSocial;
	private String nombre;
	private String url;
	private String accesToken;
	private String accesSecret;

	public RedSocial() {
		super();
	}

	public RedSocial(Integer idRedSocial) {
		super();
		this.idRedSocial = idRedSocial;
	}

	public RedSocial(
			String nombre,
			String url,
			String accesToken,
			String accesSecret) {
		super();
		this.nombre = nombre;
		this.url = url;
		this.accesToken = accesToken;
		this.accesSecret = accesSecret;
	}

	@Id
	@SequenceGenerator(name = "tb_red_social_sequence", sequenceName = "public.tb_red_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_red_social_sequence")
	@Column(name="id_red_social")
	public Integer getIdRedSocial() {
		return idRedSocial;
	}

	public void setIdRedSocial(Integer idRedSocial) {
		this.idRedSocial = idRedSocial;
	}

	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name="acces_token")
	public String getAccesToken() {
		return accesToken;
	}

	public void setAccesToken(String accesToken) {
		this.accesToken = accesToken;
	}

	@Column(name="acces_secret")
	public String getAccesSecret() {
		return accesSecret;
	}

	public void setAccesSecret(String accesSecret) {
		this.accesSecret = accesSecret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRedSocial == null) ? 0 : idRedSocial.hashCode());
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
		RedSocial other = (RedSocial) obj;
		if (idRedSocial == null) {
			return false;
		} 
		if (!idRedSocial.equals(other.idRedSocial)) {
			return false;
		} 
		return true;
	}

}
