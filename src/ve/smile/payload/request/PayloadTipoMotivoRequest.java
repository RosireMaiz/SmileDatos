package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoMotivo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoMotivoRequest extends IPayloadRequest<TipoMotivo> {

	private List<TipoMotivo> objetos;

	private TipoMotivo objeto;

	public PayloadTipoMotivoRequest() {
		super();
	}

	@Override
	public List<TipoMotivo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoMotivo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoMotivo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoMotivo objeto) {
		this.objeto = objeto;
	}

}
