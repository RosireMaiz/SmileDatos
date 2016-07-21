package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Notificacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadNotificacionRequest extends IPayloadRequest<Notificacion> {

	private List<Notificacion> objetos;

	private Notificacion objeto;

	public PayloadNotificacionRequest() {
		super();
	}

	@Override
	public List<Notificacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Notificacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Notificacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Notificacion objeto) {
		this.objeto = objeto;
	}

}
