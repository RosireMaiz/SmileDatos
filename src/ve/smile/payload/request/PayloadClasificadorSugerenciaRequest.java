package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorSugerencia;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorSugerenciaRequest extends IPayloadRequest<ClasificadorSugerencia> {

	private List<ClasificadorSugerencia> objetos;

	private ClasificadorSugerencia objeto;

	public PayloadClasificadorSugerenciaRequest() {
		super();
	}

	@Override
	public List<ClasificadorSugerencia> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorSugerencia> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorSugerencia getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorSugerencia objeto) {
		this.objeto = objeto;
	}

}
