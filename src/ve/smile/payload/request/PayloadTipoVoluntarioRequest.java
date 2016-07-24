package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoVoluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoVoluntarioRequest extends IPayloadRequest<TipoVoluntario> {

	private List<TipoVoluntario> objetos;

	private TipoVoluntario objeto;

	public PayloadTipoVoluntarioRequest() {
		super();
	}

	@Override
	public List<TipoVoluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoVoluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoVoluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoVoluntario objeto) {
		this.objeto = objeto;
	}

}
