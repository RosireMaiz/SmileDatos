package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoTrabajoSocial;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoTrabajoSocialRequest extends IPayloadRequest<TipoTrabajoSocial> {

	private List<TipoTrabajoSocial> objetos;

	private TipoTrabajoSocial objeto;

	public PayloadTipoTrabajoSocialRequest() {
		super();
	}

	@Override
	public List<TipoTrabajoSocial> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoTrabajoSocial> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoTrabajoSocial getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoTrabajoSocial objeto) {
		this.objeto = objeto;
	}

}
