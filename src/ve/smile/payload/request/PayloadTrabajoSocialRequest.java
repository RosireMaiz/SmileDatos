package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TrabajoSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTrabajoSocialRequest extends IPayloadRequest<TrabajoSocial> {

	private List<TrabajoSocial> objetos;

	private TrabajoSocial objeto;

	public PayloadTrabajoSocialRequest() {
		super();
	}

	@Override
	public List<TrabajoSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TrabajoSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TrabajoSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TrabajoSocial objeto) {
		this.objeto = objeto;
	}

}
