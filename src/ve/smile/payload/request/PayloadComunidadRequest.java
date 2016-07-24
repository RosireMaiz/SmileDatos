package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Comunidad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadComunidadRequest extends IPayloadRequest<Comunidad> {

	private List<Comunidad> objetos;

	private Comunidad objeto;

	public PayloadComunidadRequest() {
		super();
	}

	@Override
	public List<Comunidad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Comunidad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Comunidad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Comunidad objeto) {
		this.objeto = objeto;
	}

}
