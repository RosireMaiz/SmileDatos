package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.VoluntarioClasificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVoluntarioClasificadoRequest extends IPayloadRequest<VoluntarioClasificado> {

	private List<VoluntarioClasificado> objetos;

	private VoluntarioClasificado objeto;

	public PayloadVoluntarioClasificadoRequest() {
		super();
	}

	@Override
	public List<VoluntarioClasificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VoluntarioClasificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VoluntarioClasificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VoluntarioClasificado objeto) {
		this.objeto = objeto;
	}

}
