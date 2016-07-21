package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanActividadRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanActividadRecursoRequest extends IPayloadRequest<TsPlanActividadRecurso> {

	private List<TsPlanActividadRecurso> objetos;

	private TsPlanActividadRecurso objeto;

	public PayloadTsPlanActividadRecursoRequest() {
		super();
	}

	@Override
	public List<TsPlanActividadRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanActividadRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanActividadRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanActividadRecurso objeto) {
		this.objeto = objeto;
	}

}
