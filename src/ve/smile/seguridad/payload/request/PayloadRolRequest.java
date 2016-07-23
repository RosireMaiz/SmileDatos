package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Rol;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRolRequest extends IPayloadRequest<Rol> {

	private List<Rol> objetos;

	private Rol objeto;

	public PayloadRolRequest() {
		super();
	}

	@Override
	public List<Rol> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Rol> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Rol getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Rol objeto) {
		this.objeto = objeto;
	}

}
