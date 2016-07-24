package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MetaEventPlanificadoTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetaEventPlanificadoTareaRequest extends IPayloadRequest<MetaEventPlanificadoTarea> {

	private List<MetaEventPlanificadoTarea> objetos;

	private MetaEventPlanificadoTarea objeto;

	public PayloadMetaEventPlanificadoTareaRequest() {
		super();
	}

	@Override
	public List<MetaEventPlanificadoTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MetaEventPlanificadoTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MetaEventPlanificadoTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MetaEventPlanificadoTarea objeto) {
		this.objeto = objeto;
	}

}
