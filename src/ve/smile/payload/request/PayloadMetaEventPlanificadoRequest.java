package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MetaEventPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetaEventPlanificadoRequest extends IPayloadRequest<MetaEventPlanificado> {

	private List<MetaEventPlanificado> objetos;

	private MetaEventPlanificado objeto;

	public PayloadMetaEventPlanificadoRequest() {
		super();
	}

	@Override
	public List<MetaEventPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MetaEventPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MetaEventPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MetaEventPlanificado objeto) {
		this.objeto = objeto;
	}

}
