package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanPatrocinador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanPatrocinadorRequest extends IPayloadRequest<EventPlanPatrocinador> {

	private List<EventPlanPatrocinador> objetos;

	private EventPlanPatrocinador objeto;

	public PayloadEventPlanPatrocinadorRequest() {
		super();
	}

	@Override
	public List<EventPlanPatrocinador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanPatrocinador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanPatrocinador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanPatrocinador objeto) {
		this.objeto = objeto;
	}

}
