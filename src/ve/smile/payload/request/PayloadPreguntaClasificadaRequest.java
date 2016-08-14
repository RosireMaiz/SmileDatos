package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PreguntaClasificada;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPreguntaClasificadaRequest extends IPayloadRequest<PreguntaClasificada> {

	private List<PreguntaClasificada> objetos;

	private PreguntaClasificada objeto;

	public PayloadPreguntaClasificadaRequest() {
		super();
	}

	@Override
	public List<PreguntaClasificada> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PreguntaClasificada> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PreguntaClasificada getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PreguntaClasificada objeto) {
		this.objeto = objeto;
	}

}
