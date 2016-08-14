package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Cargo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCargoRequest extends IPayloadRequest<Cargo> {

	private List<Cargo> objetos;

	private Cargo objeto;

	public PayloadCargoRequest() {
		super();
	}

	@Override
	public List<Cargo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Cargo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Cargo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Cargo objeto) {
		this.objeto = objeto;
	}

}
