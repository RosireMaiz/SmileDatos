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

@Table(name = "tb_red_social_organizacion")
@Entity
public class RedSocialOrganizacion {

	private Integer idRedSocialOrganizacion;
	private Organizacion fkOrganizacion;
	private RedSocial fkRedSocial;
	private String authAccess;
	private String provider;
	private String url;
	private String authToken;

	public RedSocialOrganizacion() {
		super();
	}

	public RedSocialOrganizacion(Integer idRedSocialOrganizacion) {
		super();
		this.idRedSocialOrganizacion = idRedSocialOrganizacion;
	}

	public RedSocialOrganizacion(
			Organizacion fkOrganizacion,
			RedSocial fkRedSocial,
			String authAccess,
			String provider,
			String url,
			String authToken) {
		super();
		this.fkOrganizacion = fkOrganizacion;
		this.fkRedSocial = fkRedSocial;
		this.authAccess = authAccess;
		this.provider = provider;
		this.url = url;
		this.authToken = authToken;
	}

	@Id
	@SequenceGenerator(name = "tb_red_social_organizacion_sequence", sequenceName = "public.tb_red_social_organizacion_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_red_social_organizacion_sequence")
	@Column(name="id_red_social_organizacion")
	public Integer getIdRedSocialOrganizacion() {
		return idRedSocialOrganizacion;
	}

	public void setIdRedSocialOrganizacion(Integer idRedSocialOrganizacion) {
		this.idRedSocialOrganizacion = idRedSocialOrganizacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_organizacion", nullable = false)
	public Organizacion getFkOrganizacion() {
		return fkOrganizacion;
	}

	public void setFkOrganizacion(Organizacion fkOrganizacion) {
		this.fkOrganizacion = fkOrganizacion;
	}

	@ManyToOne
	@JoinColumn(name = "fk_red_social", nullable = false)
	public RedSocial getFkRedSocial() {
		return fkRedSocial;
	}

	public void setFkRedSocial(RedSocial fkRedSocial) {
		this.fkRedSocial = fkRedSocial;
	}

	@Column(name="auth_access")
	public String getAuthAccess() {
		return authAccess;
	}

	public void setAuthAccess(String authAccess) {
		this.authAccess = authAccess;
	}

	@Column(name="provider")
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@Column(name="url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name="auth_token")
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRedSocialOrganizacion == null) ? 0 : idRedSocialOrganizacion.hashCode());
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
		RedSocialOrganizacion other = (RedSocialOrganizacion) obj;
		if (idRedSocialOrganizacion == null) {
			return false;
		} 
		if (!idRedSocialOrganizacion.equals(other.idRedSocialOrganizacion)) {
			return false;
		} 
		return true;
	}

}
