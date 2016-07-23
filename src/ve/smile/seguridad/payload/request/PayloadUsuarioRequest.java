package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Usuario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadUsuarioRequest extends IPayloadRequest<Usuario> {

	private List<Usuario> objetos;

	private Usuario objeto;

	public PayloadUsuarioRequest() {
		super();
	}

	@Override
	public List<Usuario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Usuario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Usuario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Usuario objeto) {
		this.objeto = objeto;
	}

}
