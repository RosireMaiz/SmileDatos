package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EtiqAlbum;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEtiqAlbumRequest extends IPayloadRequest<EtiqAlbum> {

	private List<EtiqAlbum> objetos;

	private EtiqAlbum objeto;

	public PayloadEtiqAlbumRequest() {
		super();
	}

	@Override
	public List<EtiqAlbum> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EtiqAlbum> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EtiqAlbum getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EtiqAlbum objeto) {
		this.objeto = objeto;
	}

}
