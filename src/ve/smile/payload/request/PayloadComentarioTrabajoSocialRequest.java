package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ComentarioTrabajoSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadComentarioTrabajoSocialRequest extends IPayloadRequest<ComentarioTrabajoSocial> {

	private List<ComentarioTrabajoSocial> objetos;

	private ComentarioTrabajoSocial objeto;

	public PayloadComentarioTrabajoSocialRequest() {
		super();
	}

	@Override
	public List<ComentarioTrabajoSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ComentarioTrabajoSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ComentarioTrabajoSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ComentarioTrabajoSocial objeto) {
		this.objeto = objeto;
	}

}
