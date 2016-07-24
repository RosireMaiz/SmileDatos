package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.RedSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRedSocialRequest extends IPayloadRequest<RedSocial> {

	private List<RedSocial> objetos;

	private RedSocial objeto;

	public PayloadRedSocialRequest() {
		super();
	}

	@Override
	public List<RedSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RedSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public RedSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(RedSocial objeto) {
		this.objeto = objeto;
	}

}
