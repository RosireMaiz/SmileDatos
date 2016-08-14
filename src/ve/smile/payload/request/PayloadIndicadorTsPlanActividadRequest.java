package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IndicadorTsPlanActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIndicadorTsPlanActividadRequest extends IPayloadRequest<IndicadorTsPlanActividad> {

	private List<IndicadorTsPlanActividad> objetos;

	private IndicadorTsPlanActividad objeto;

	public PayloadIndicadorTsPlanActividadRequest() {
		super();
	}

	@Override
	public List<IndicadorTsPlanActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IndicadorTsPlanActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IndicadorTsPlanActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IndicadorTsPlanActividad objeto) {
		this.objeto = objeto;
	}

}
