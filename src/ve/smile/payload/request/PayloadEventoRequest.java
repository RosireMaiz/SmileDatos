package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Evento;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventoRequest extends IPayloadRequest<Evento> {

	private List<Evento> objetos;

	private Evento objeto;

	public PayloadEventoRequest() {
		super();
	}

	@Override
	public List<Evento> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Evento> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Evento getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Evento objeto) {
		this.objeto = objeto;
	}

}
