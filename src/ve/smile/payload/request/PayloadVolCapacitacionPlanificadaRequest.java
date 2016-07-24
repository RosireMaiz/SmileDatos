package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.VolCapacitacionPlanificada;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVolCapacitacionPlanificadaRequest extends IPayloadRequest<VolCapacitacionPlanificada> {

	private List<VolCapacitacionPlanificada> objetos;

	private VolCapacitacionPlanificada objeto;

	public PayloadVolCapacitacionPlanificadaRequest() {
		super();
	}

	@Override
	public List<VolCapacitacionPlanificada> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VolCapacitacionPlanificada> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VolCapacitacionPlanificada getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VolCapacitacionPlanificada objeto) {
		this.objeto = objeto;
	}

}
