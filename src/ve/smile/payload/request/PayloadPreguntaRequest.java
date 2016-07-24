package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Pregunta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPreguntaRequest extends IPayloadRequest<Pregunta> {

	private List<Pregunta> objetos;

	private Pregunta objeto;

	public PayloadPreguntaRequest() {
		super();
	}

	@Override
	public List<Pregunta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Pregunta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Pregunta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Pregunta objeto) {
		this.objeto = objeto;
	}

}
