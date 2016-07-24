package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoRecursoRequest extends IPayloadRequest<TipoRecurso> {

	private List<TipoRecurso> objetos;

	private TipoRecurso objeto;

	public PayloadTipoRecursoRequest() {
		super();
	}

	@Override
	public List<TipoRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoRecurso objeto) {
		this.objeto = objeto;
	}

}
