package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorMotivo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorMotivoRequest extends IPayloadRequest<ClasificadorMotivo> {

	private List<ClasificadorMotivo> objetos;

	private ClasificadorMotivo objeto;

	public PayloadClasificadorMotivoRequest() {
		super();
	}

	@Override
	public List<ClasificadorMotivo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorMotivo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorMotivo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorMotivo objeto) {
		this.objeto = objeto;
	}

}
