package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanTareaVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanTareaVoluntarioRequest extends IPayloadRequest<EventPlanTareaVoluntario> {

	private List<EventPlanTareaVoluntario> objetos;

	private EventPlanTareaVoluntario objeto;

	public PayloadEventPlanTareaVoluntarioRequest() {
		super();
	}

	@Override
	public List<EventPlanTareaVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanTareaVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanTareaVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanTareaVoluntario objeto) {
		this.objeto = objeto;
	}

}
