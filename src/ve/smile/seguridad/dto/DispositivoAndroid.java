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

@Table(name = "tb_dispositivo_android")
@Entity
public class DispositivoAndroid {

	private Integer idDispositivoAndroid;
	private Usuario fkUsuario;
	private String registrationId;

	public DispositivoAndroid() {
		super();
	}

	public DispositivoAndroid(Integer idDispositivoAndroid) {
		super();
		this.idDispositivoAndroid = idDispositivoAndroid;
	}

	public DispositivoAndroid(
			Usuario fkUsuario,
			String registrationId) {
		super();
		this.fkUsuario = fkUsuario;
		this.registrationId = registrationId;
	}

	@Id
	@SequenceGenerator(name = "tb_dispositivo_android_sequence", sequenceName = "public.tb_dispositivo_android_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_dispositivo_android_sequence")
	@Column(name="id_dispositivo_android")
	public Integer getIdDispositivoAndroid() {
		return idDispositivoAndroid;
	}

	public void setIdDispositivoAndroid(Integer idDispositivoAndroid) {
		this.idDispositivoAndroid = idDispositivoAndroid;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Column(name="registration_id")
	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDispositivoAndroid == null) ? 0 : idDispositivoAndroid.hashCode());
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
		DispositivoAndroid other = (DispositivoAndroid) obj;
		if (idDispositivoAndroid == null) {
			return false;
		} 
		if (!idDispositivoAndroid.equals(other.idDispositivoAndroid)) {
			return false;
		} 
		return true;
	}

}
