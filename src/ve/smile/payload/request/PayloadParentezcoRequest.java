package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Parentezco;
import lights.core.payload.request.IPayloadRequest;

public class PayloadParentezcoRequest extends IPayloadRequest<Parentezco> {

	private List<Parentezco> objetos;

	private Parentezco objeto;

	public PayloadParentezcoRequest() {
		super();
	}

	@Override
	public List<Parentezco> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Parentezco> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Parentezco getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Parentezco objeto) {
		this.objeto = objeto;
	}

}
