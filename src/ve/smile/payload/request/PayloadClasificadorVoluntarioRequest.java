package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorVoluntarioRequest extends IPayloadRequest<ClasificadorVoluntario> {

	private List<ClasificadorVoluntario> objetos;

	private ClasificadorVoluntario objeto;

	public PayloadClasificadorVoluntarioRequest() {
		super();
	}

	@Override
	public List<ClasificadorVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorVoluntario objeto) {
		this.objeto = objeto;
	}

}
