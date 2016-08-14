package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.MultimediaAlbum;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMultimediaAlbumRequest extends IPayloadRequest<MultimediaAlbum> {

	private List<MultimediaAlbum> objetos;

	private MultimediaAlbum objeto;

	public PayloadMultimediaAlbumRequest() {
		super();
	}

	@Override
	public List<MultimediaAlbum> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MultimediaAlbum> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MultimediaAlbum getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MultimediaAlbum objeto) {
		this.objeto = objeto;
	}

}
