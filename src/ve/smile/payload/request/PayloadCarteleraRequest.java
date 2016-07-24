package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Cartelera;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCarteleraRequest extends IPayloadRequest<Cartelera> {

	private List<Cartelera> objetos;

	private Cartelera objeto;

	public PayloadCarteleraRequest() {
		super();
	}

	@Override
	public List<Cartelera> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Cartelera> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Cartelera getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Cartelera objeto) {
		this.objeto = objeto;
	}

}
