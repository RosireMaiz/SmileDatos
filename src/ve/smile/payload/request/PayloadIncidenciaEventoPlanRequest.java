package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IncidenciaEventoPlan;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIncidenciaEventoPlanRequest extends IPayloadRequest<IncidenciaEventoPlan> {

	private List<IncidenciaEventoPlan> objetos;

	private IncidenciaEventoPlan objeto;

	public PayloadIncidenciaEventoPlanRequest() {
		super();
	}

	@Override
	public List<IncidenciaEventoPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IncidenciaEventoPlan> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IncidenciaEventoPlan getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IncidenciaEventoPlan objeto) {
		this.objeto = objeto;
	}

}
