package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Album;
import lights.core.payload.request.IPayloadRequest;

public class PayloadAlbumRequest extends IPayloadRequest<Album> {

	private List<Album> objetos;

	private Album objeto;

	public PayloadAlbumRequest() {
		super();
	}

	@Override
	public List<Album> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Album> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Album getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Album objeto) {
		this.objeto = objeto;
	}

}
