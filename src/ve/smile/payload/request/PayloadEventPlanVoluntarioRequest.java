package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanVoluntarioRequest extends IPayloadRequest<EventPlanVoluntario> {

	private List<EventPlanVoluntario> objetos;

	private EventPlanVoluntario objeto;

	public PayloadEventPlanVoluntarioRequest() {
		super();
	}

	@Override
	public List<EventPlanVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanVoluntario objeto) {
		this.objeto = objeto;
	}

}
