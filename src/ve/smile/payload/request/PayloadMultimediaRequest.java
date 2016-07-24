package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Multimedia;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMultimediaRequest extends IPayloadRequest<Multimedia> {

	private List<Multimedia> objetos;

	private Multimedia objeto;

	public PayloadMultimediaRequest() {
		super();
	}

	@Override
	public List<Multimedia> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Multimedia> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Multimedia getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Multimedia objeto) {
		this.objeto = objeto;
	}

}
