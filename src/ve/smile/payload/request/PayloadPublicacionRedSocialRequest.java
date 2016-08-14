package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.PublicacionRedSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPublicacionRedSocialRequest extends IPayloadRequest<PublicacionRedSocial> {

	private List<PublicacionRedSocial> objetos;

	private PublicacionRedSocial objeto;

	public PayloadPublicacionRedSocialRequest() {
		super();
	}

	@Override
	public List<PublicacionRedSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<PublicacionRedSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public PublicacionRedSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(PublicacionRedSocial objeto) {
		this.objeto = objeto;
	}

}
