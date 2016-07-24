package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanTareaRequest extends IPayloadRequest<EventPlanTarea> {

	private List<EventPlanTarea> objetos;

	private EventPlanTarea objeto;

	public PayloadEventPlanTareaRequest() {
		super();
	}

	@Override
	public List<EventPlanTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanTarea objeto) {
		this.objeto = objeto;
	}

}
