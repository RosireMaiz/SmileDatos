package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Sugerencia;
import lights.core.payload.request.IPayloadRequest;

public class PayloadSugerenciaRequest extends IPayloadRequest<Sugerencia> {

	private List<Sugerencia> objetos;

	private Sugerencia objeto;

	public PayloadSugerenciaRequest() {
		super();
	}

	@Override
	public List<Sugerencia> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Sugerencia> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Sugerencia getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Sugerencia objeto) {
		this.objeto = objeto;
	}

}
