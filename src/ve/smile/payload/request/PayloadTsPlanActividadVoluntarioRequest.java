package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanActividadVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanActividadVoluntarioRequest extends IPayloadRequest<TsPlanActividadVoluntario> {

	private List<TsPlanActividadVoluntario> objetos;

	private TsPlanActividadVoluntario objeto;

	public PayloadTsPlanActividadVoluntarioRequest() {
		super();
	}

	@Override
	public List<TsPlanActividadVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanActividadVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanActividadVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanActividadVoluntario objeto) {
		this.objeto = objeto;
	}

}
