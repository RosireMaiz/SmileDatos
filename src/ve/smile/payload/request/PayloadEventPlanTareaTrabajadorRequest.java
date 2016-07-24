package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanTareaTrabajador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanTareaTrabajadorRequest extends IPayloadRequest<EventPlanTareaTrabajador> {

	private List<EventPlanTareaTrabajador> objetos;

	private EventPlanTareaTrabajador objeto;

	public PayloadEventPlanTareaTrabajadorRequest() {
		super();
	}

	@Override
	public List<EventPlanTareaTrabajador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanTareaTrabajador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanTareaTrabajador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanTareaTrabajador objeto) {
		this.objeto = objeto;
	}

}
