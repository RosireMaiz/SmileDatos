package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.VistaOperacionCustom;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVistaOperacionCustomRequest extends IPayloadRequest<VistaOperacionCustom> {

	private List<VistaOperacionCustom> objetos;

	private VistaOperacionCustom objeto;

	public PayloadVistaOperacionCustomRequest() {
		super();
	}

	@Override
	public List<VistaOperacionCustom> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VistaOperacionCustom> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VistaOperacionCustom getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VistaOperacionCustom objeto) {
		this.objeto = objeto;
	}

}
