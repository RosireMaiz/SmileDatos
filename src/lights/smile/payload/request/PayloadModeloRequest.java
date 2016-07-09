package lights.smile.payload.request;

import java.util.List;

import lights.smile.dto.Modelo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadModeloRequest extends IPayloadRequest<Modelo> {

	private List<Modelo> objetos;

	private Modelo objeto;

	public PayloadModeloRequest() {
		super();
	}

	@Override
	public List<Modelo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Modelo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Modelo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Modelo objeto) {
		this.objeto = objeto;
	}

}
