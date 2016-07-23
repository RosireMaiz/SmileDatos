package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Sesion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadSesionRequest extends IPayloadRequest<Sesion> {

	private List<Sesion> objetos;

	private Sesion objeto;

	public PayloadSesionRequest() {
		super();
	}

	@Override
	public List<Sesion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Sesion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Sesion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Sesion objeto) {
		this.objeto = objeto;
	}

}
