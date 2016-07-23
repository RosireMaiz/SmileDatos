package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Auditoria;
import lights.core.payload.request.IPayloadRequest;

public class PayloadAuditoriaRequest extends IPayloadRequest<Auditoria> {

	private List<Auditoria> objetos;

	private Auditoria objeto;

	public PayloadAuditoriaRequest() {
		super();
	}

	@Override
	public List<Auditoria> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Auditoria> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Auditoria getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Auditoria objeto) {
		this.objeto = objeto;
	}

}
