package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MensajeSistema;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMensajeSistemaRequest extends IPayloadRequest<MensajeSistema> {

	private List<MensajeSistema> objetos;

	private MensajeSistema objeto;

	public PayloadMensajeSistemaRequest() {
		super();
	}

	@Override
	public List<MensajeSistema> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MensajeSistema> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MensajeSistema getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MensajeSistema objeto) {
		this.objeto = objeto;
	}

}
