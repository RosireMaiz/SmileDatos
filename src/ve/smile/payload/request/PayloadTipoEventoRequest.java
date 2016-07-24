package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoEvento;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoEventoRequest extends IPayloadRequest<TipoEvento> {

	private List<TipoEvento> objetos;

	private TipoEvento objeto;

	public PayloadTipoEventoRequest() {
		super();
	}

	@Override
	public List<TipoEvento> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoEvento> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoEvento getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoEvento objeto) {
		this.objeto = objeto;
	}

}
