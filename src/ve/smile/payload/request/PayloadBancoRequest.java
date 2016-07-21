package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Banco;
import lights.core.payload.request.IPayloadRequest;

public class PayloadBancoRequest extends IPayloadRequest<Banco> {

	private List<Banco> objetos;

	private Banco objeto;

	public PayloadBancoRequest() {
		super();
	}

	@Override
	public List<Banco> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Banco> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Banco getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Banco objeto) {
		this.objeto = objeto;
	}

}
