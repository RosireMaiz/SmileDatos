package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.NotificacionUsuario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadNotificacionUsuarioRequest extends IPayloadRequest<NotificacionUsuario> {

	private List<NotificacionUsuario> objetos;

	private NotificacionUsuario objeto;

	public PayloadNotificacionUsuarioRequest() {
		super();
	}

	@Override
	public List<NotificacionUsuario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<NotificacionUsuario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public NotificacionUsuario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(NotificacionUsuario objeto) {
		this.objeto = objeto;
	}

}
