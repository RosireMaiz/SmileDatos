package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ReconocimientoPersona;
import lights.core.payload.request.IPayloadRequest;

public class PayloadReconocimientoPersonaRequest extends IPayloadRequest<ReconocimientoPersona> {

	private List<ReconocimientoPersona> objetos;

	private ReconocimientoPersona objeto;

	public PayloadReconocimientoPersonaRequest() {
		super();
	}

	@Override
	public List<ReconocimientoPersona> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ReconocimientoPersona> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ReconocimientoPersona getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ReconocimientoPersona objeto) {
		this.objeto = objeto;
	}

}
