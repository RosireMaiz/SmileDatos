package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoPregunta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoPreguntaRequest extends IPayloadRequest<TipoPregunta> {

	private List<TipoPregunta> objetos;

	private TipoPregunta objeto;

	public PayloadTipoPreguntaRequest() {
		super();
	}

	@Override
	public List<TipoPregunta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoPregunta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoPregunta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoPregunta objeto) {
		this.objeto = objeto;
	}

}
