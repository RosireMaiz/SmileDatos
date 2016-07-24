package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorTrabajoSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorTrabajoSocialRequest extends IPayloadRequest<ClasificadorTrabajoSocial> {

	private List<ClasificadorTrabajoSocial> objetos;

	private ClasificadorTrabajoSocial objeto;

	public PayloadClasificadorTrabajoSocialRequest() {
		super();
	}

	@Override
	public List<ClasificadorTrabajoSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorTrabajoSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorTrabajoSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorTrabajoSocial objeto) {
		this.objeto = objeto;
	}

}
