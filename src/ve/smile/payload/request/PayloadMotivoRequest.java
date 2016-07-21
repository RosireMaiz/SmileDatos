package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Motivo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMotivoRequest extends IPayloadRequest<Motivo> {

	private List<Motivo> objetos;

	private Motivo objeto;

	public PayloadMotivoRequest() {
		super();
	}

	@Override
	public List<Motivo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Motivo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Motivo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Motivo objeto) {
		this.objeto = objeto;
	}

}
