package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.InteraccionPortal;
import lights.core.payload.request.IPayloadRequest;

public class PayloadInteraccionPortalRequest extends IPayloadRequest<InteraccionPortal> {

	private List<InteraccionPortal> objetos;

	private InteraccionPortal objeto;

	public PayloadInteraccionPortalRequest() {
		super();
	}

	@Override
	public List<InteraccionPortal> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<InteraccionPortal> objetos) {
		this.objetos = objetos;
	}

	@Override
	public InteraccionPortal getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(InteraccionPortal objeto) {
		this.objeto = objeto;
	}

}
