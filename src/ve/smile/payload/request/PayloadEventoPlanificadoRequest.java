package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventoPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventoPlanificadoRequest extends IPayloadRequest<EventoPlanificado> {

	private List<EventoPlanificado> objetos;

	private EventoPlanificado objeto;

	public PayloadEventoPlanificadoRequest() {
		super();
	}

	@Override
	public List<EventoPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventoPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventoPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventoPlanificado objeto) {
		this.objeto = objeto;
	}

}
