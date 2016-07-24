package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.CapacitacionPlanificada;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCapacitacionPlanificadaRequest extends IPayloadRequest<CapacitacionPlanificada> {

	private List<CapacitacionPlanificada> objetos;

	private CapacitacionPlanificada objeto;

	public PayloadCapacitacionPlanificadaRequest() {
		super();
	}

	@Override
	public List<CapacitacionPlanificada> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<CapacitacionPlanificada> objetos) {
		this.objetos = objetos;
	}

	@Override
	public CapacitacionPlanificada getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(CapacitacionPlanificada objeto) {
		this.objeto = objeto;
	}

}
