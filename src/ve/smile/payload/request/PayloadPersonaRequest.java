package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Persona;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPersonaRequest extends IPayloadRequest<Persona> {

	private List<Persona> objetos;

	private Persona objeto;

	public PayloadPersonaRequest() {
		super();
	}

	@Override
	public List<Persona> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Persona> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Persona getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Persona objeto) {
		this.objeto = objeto;
	}

}
