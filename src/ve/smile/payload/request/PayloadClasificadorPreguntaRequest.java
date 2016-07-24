package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorPregunta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorPreguntaRequest extends IPayloadRequest<ClasificadorPregunta> {

	private List<ClasificadorPregunta> objetos;

	private ClasificadorPregunta objeto;

	public PayloadClasificadorPreguntaRequest() {
		super();
	}

	@Override
	public List<ClasificadorPregunta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorPregunta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorPregunta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorPregunta objeto) {
		this.objeto = objeto;
	}

}
