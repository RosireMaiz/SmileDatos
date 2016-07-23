package ve.smile.seguridad.auxiliary.dto;

import ve.smile.seguridad.dto.Usuario;



public class UsuarioActivo {
	
	private Long tiempoConectado;
	
	private Usuario usuario;

	public UsuarioActivo(Usuario usuario, Long tiempoConectado) {
		super();
		this.usuario = usuario;
		this.tiempoConectado = tiempoConectado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getTiempoConectado() {
		return tiempoConectado;
	}

	public void setTiempoConectado(Long tiempoConectado) {
		this.tiempoConectado = tiempoConectado;
	}
	
}
