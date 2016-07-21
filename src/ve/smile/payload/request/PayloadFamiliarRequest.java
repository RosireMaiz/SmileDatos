package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Familiar;
import lights.core.payload.request.IPayloadRequest;

public class PayloadFamiliarRequest extends IPayloadRequest<Familiar> {

	private List<Familiar> objetos;

	private Familiar objeto;

	public PayloadFamiliarRequest() {
		super();
	}

	@Override
	public List<Familiar> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Familiar> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Familiar getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Familiar objeto) {
		this.objeto = objeto;
	}

}
