package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ComentarioAlbum;
import lights.core.payload.request.IPayloadRequest;

public class PayloadComentarioAlbumRequest extends IPayloadRequest<ComentarioAlbum> {

	private List<ComentarioAlbum> objetos;

	private ComentarioAlbum objeto;

	public PayloadComentarioAlbumRequest() {
		super();
	}

	@Override
	public List<ComentarioAlbum> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ComentarioAlbum> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ComentarioAlbum getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ComentarioAlbum objeto) {
		this.objeto = objeto;
	}

}
