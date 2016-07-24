package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorPersona;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorPersonaRequest extends IPayloadRequest<ClasificadorPersona> {

	private List<ClasificadorPersona> objetos;

	private ClasificadorPersona objeto;

	public PayloadClasificadorPersonaRequest() {
		super();
	}

	@Override
	public List<ClasificadorPersona> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorPersona> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorPersona getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorPersona objeto) {
		this.objeto = objeto;
	}

}
