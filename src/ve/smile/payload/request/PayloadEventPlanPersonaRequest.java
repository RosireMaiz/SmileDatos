package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanPersona;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanPersonaRequest extends IPayloadRequest<EventPlanPersona> {

	private List<EventPlanPersona> objetos;

	private EventPlanPersona objeto;

	public PayloadEventPlanPersonaRequest() {
		super();
	}

	@Override
	public List<EventPlanPersona> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanPersona> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanPersona getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanPersona objeto) {
		this.objeto = objeto;
	}

}
