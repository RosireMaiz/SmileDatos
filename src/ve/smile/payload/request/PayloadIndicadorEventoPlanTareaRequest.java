package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IndicadorEventoPlanTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIndicadorEventoPlanTareaRequest extends IPayloadRequest<IndicadorEventoPlanTarea> {

	private List<IndicadorEventoPlanTarea> objetos;

	private IndicadorEventoPlanTarea objeto;

	public PayloadIndicadorEventoPlanTareaRequest() {
		super();
	}

	@Override
	public List<IndicadorEventoPlanTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IndicadorEventoPlanTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IndicadorEventoPlanTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IndicadorEventoPlanTarea objeto) {
		this.objeto = objeto;
	}

}
