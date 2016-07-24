package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorEvento;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorEventoRequest extends IPayloadRequest<ClasificadorEvento> {

	private List<ClasificadorEvento> objetos;

	private ClasificadorEvento objeto;

	public PayloadClasificadorEventoRequest() {
		super();
	}

	@Override
	public List<ClasificadorEvento> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorEvento> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorEvento getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorEvento objeto) {
		this.objeto = objeto;
	}

}
