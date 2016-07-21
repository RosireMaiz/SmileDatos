package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Recurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRecursoRequest extends IPayloadRequest<Recurso> {

	private List<Recurso> objetos;

	private Recurso objeto;

	public PayloadRecursoRequest() {
		super();
	}

	@Override
	public List<Recurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Recurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Recurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Recurso objeto) {
		this.objeto = objeto;
	}

}
