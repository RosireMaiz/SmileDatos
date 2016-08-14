package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IncidenciaTsPlan;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIncidenciaTsPlanRequest extends IPayloadRequest<IncidenciaTsPlan> {

	private List<IncidenciaTsPlan> objetos;

	private IncidenciaTsPlan objeto;

	public PayloadIncidenciaTsPlanRequest() {
		super();
	}

	@Override
	public List<IncidenciaTsPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IncidenciaTsPlan> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IncidenciaTsPlan getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IncidenciaTsPlan objeto) {
		this.objeto = objeto;
	}

}
