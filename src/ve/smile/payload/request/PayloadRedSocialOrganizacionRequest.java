package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.RedSocialOrganizacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRedSocialOrganizacionRequest extends IPayloadRequest<RedSocialOrganizacion> {

	private List<RedSocialOrganizacion> objetos;

	private RedSocialOrganizacion objeto;

	public PayloadRedSocialOrganizacionRequest() {
		super();
	}

	@Override
	public List<RedSocialOrganizacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RedSocialOrganizacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public RedSocialOrganizacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(RedSocialOrganizacion objeto) {
		this.objeto = objeto;
	}

}
