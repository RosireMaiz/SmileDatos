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

@Table(name = "tb_evento_favorito_usuario")
@Entity
public class EventoFavoritoUsuario {

	private Integer idEventoFavoritoUsuario;
	private Usuario fkUsuario;
	private EventoPlanificado fkEventoPlanificado;

	public EventoFavoritoUsuario() {
		super();
	}

	public EventoFavoritoUsuario(Integer idEventoFavoritoUsuario) {
		super();
		this.idEventoFavoritoUsuario = idEventoFavoritoUsuario;
	}

	public EventoFavoritoUsuario(
			Usuario fkUsuario,
			EventoPlanificado fkEventoPlanificado) {
		super();
		this.fkUsuario = fkUsuario;
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Id
	@SequenceGenerator(name = "tb_evento_favorito_usuario_sequence", sequenceName = "public.tb_evento_favorito_usuario_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tb_evento_favorito_usuario_sequence")
	@Column(name="id_evento_favorito_usuario")
	public Integer getIdEventoFavoritoUsuario() {
		return idEventoFavoritoUsuario;
	}

	public void setIdEventoFavoritoUsuario(Integer idEventoFavoritoUsuario) {
		this.idEventoFavoritoUsuario = idEventoFavoritoUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_usuario", nullable = false)
	public Usuario getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuario fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "fk_evento_planificado", nullable = false)
	public EventoPlanificado getFkEventoPlanificado() {
		return fkEventoPlanificado;
	}

	public void setFkEventoPlanificado(EventoPlanificado fkEventoPlanificado) {
		this.fkEventoPlanificado = fkEventoPlanificado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEventoFavoritoUsuario == null) ? 0 : idEventoFavoritoUsuario.hashCode());
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
		EventoFavoritoUsuario other = (EventoFavoritoUsuario) obj;
		if (idEventoFavoritoUsuario == null) {
			return false;
		} 
		if (!idEventoFavoritoUsuario.equals(other.idEventoFavoritoUsuario)) {
			return false;
		} 
		return true;
	}

}
