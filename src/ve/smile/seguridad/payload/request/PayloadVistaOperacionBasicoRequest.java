package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.VistaOperacionBasico;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVistaOperacionBasicoRequest extends IPayloadRequest<VistaOperacionBasico> {

	private List<VistaOperacionBasico> objetos;

	private VistaOperacionBasico objeto;

	public PayloadVistaOperacionBasicoRequest() {
		super();
	}

	@Override
	public List<VistaOperacionBasico> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VistaOperacionBasico> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VistaOperacionBasico getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VistaOperacionBasico objeto) {
		this.objeto = objeto;
	}

}
