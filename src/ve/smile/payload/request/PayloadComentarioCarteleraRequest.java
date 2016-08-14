package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ComentarioCartelera;
import lights.core.payload.request.IPayloadRequest;

public class PayloadComentarioCarteleraRequest extends IPayloadRequest<ComentarioCartelera> {

	private List<ComentarioCartelera> objetos;

	private ComentarioCartelera objeto;

	public PayloadComentarioCarteleraRequest() {
		super();
	}

	@Override
	public List<ComentarioCartelera> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ComentarioCartelera> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ComentarioCartelera getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ComentarioCartelera objeto) {
		this.objeto = objeto;
	}

}
