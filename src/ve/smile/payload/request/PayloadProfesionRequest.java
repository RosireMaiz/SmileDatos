package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Profesion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadProfesionRequest extends IPayloadRequest<Profesion> {

	private List<Profesion> objetos;

	private Profesion objeto;

	public PayloadProfesionRequest() {
		super();
	}

	@Override
	public List<Profesion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Profesion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Profesion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Profesion objeto) {
		this.objeto = objeto;
	}

}
