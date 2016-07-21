package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Directorio;
import lights.core.payload.request.IPayloadRequest;

public class PayloadDirectorioRequest extends IPayloadRequest<Directorio> {

	private List<Directorio> objetos;

	private Directorio objeto;

	public PayloadDirectorioRequest() {
		super();
	}

	@Override
	public List<Directorio> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Directorio> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Directorio getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Directorio objeto) {
		this.objeto = objeto;
	}

}
