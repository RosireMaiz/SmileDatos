package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Ayuda;
import lights.core.payload.request.IPayloadRequest;

public class PayloadAyudaRequest extends IPayloadRequest<Ayuda> {

	private List<Ayuda> objetos;

	private Ayuda objeto;

	public PayloadAyudaRequest() {
		super();
	}

	@Override
	public List<Ayuda> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Ayuda> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Ayuda getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Ayuda objeto) {
		this.objeto = objeto;
	}

}
