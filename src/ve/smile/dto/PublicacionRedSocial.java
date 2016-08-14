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

@Table(name = "tb_publicacion_red_social")
@Entity
public class PublicacionRedSocial {

	private Integer idPublicacionRedSocial;
	private RedSocialOrganizacion fkRedSocialOrganizacion;
	private Integer publicacionGenericoId;
	private Long fecha;
	private String contenido;

	public PublicacionRedSocial() {
		super();
	}

	public PublicacionRedSocial(Integer idPublicacionRedSocial) {
		super();
		this.idPublicacionRedSocial = idPublicacionRedSocial;
	}

	public PublicacionRedSocial(
			RedSocialOrganizacion fkRedSocialOrganizacion,
			Integer publicacionGenericoId,
			Long fecha,
			String contenido) {
		super();
		this.fkRedSocialOrganizacion = fkRedSocialOrganizacion;
		this.publicacionGenericoId = publicacionGenericoId;
		this.fecha = fecha;
		this.contenido = contenido;
	}

	@Id
	@SequenceGenerator(name = "tb_publicacion_red_social_sequence", sequenceName = "public.tb_publicacion_red_social_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_publicacion_red_social_sequence")
	@Column(name="id_publicacion_red_social")
	public Integer getIdPublicacionRedSocial() {
		return idPublicacionRedSocial;
	}

	public void setIdPublicacionRedSocial(Integer idPublicacionRedSocial) {
		this.idPublicacionRedSocial = idPublicacionRedSocial;
	}

	@ManyToOne
	@JoinColumn(name = "fk_red_social_organizacion", nullable = false)
	public RedSocialOrganizacion getFkRedSocialOrganizacion() {
		return fkRedSocialOrganizacion;
	}

	public void setFkRedSocialOrganizacion(RedSocialOrganizacion fkRedSocialOrganizacion) {
		this.fkRedSocialOrganizacion = fkRedSocialOrganizacion;
	}

	@Column(name="publicacion_generico_id")
	public Integer getPublicacionGenericoId() {
		return publicacionGenericoId;
	}

	public void setPublicacionGenericoId(Integer publicacionGenericoId) {
		this.publicacionGenericoId = publicacionGenericoId;
	}

	@Column(name="fecha")
	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
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
		result = prime * result + ((idPublicacionRedSocial == null) ? 0 : idPublicacionRedSocial.hashCode());
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
		PublicacionRedSocial other = (PublicacionRedSocial) obj;
		if (idPublicacionRedSocial == null) {
			return false;
		} 
		if (!idPublicacionRedSocial.equals(other.idPublicacionRedSocial)) {
			return false;
		} 
		return true;
	}

}
