package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventPlanTareaRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventPlanTareaRecursoRequest extends IPayloadRequest<EventPlanTareaRecurso> {

	private List<EventPlanTareaRecurso> objetos;

	private EventPlanTareaRecurso objeto;

	public PayloadEventPlanTareaRecursoRequest() {
		super();
	}

	@Override
	public List<EventPlanTareaRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventPlanTareaRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventPlanTareaRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventPlanTareaRecurso objeto) {
		this.objeto = objeto;
	}

}
