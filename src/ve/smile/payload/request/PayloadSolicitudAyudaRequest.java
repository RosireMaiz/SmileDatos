package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.SolicitudAyuda;
import lights.core.payload.request.IPayloadRequest;

public class PayloadSolicitudAyudaRequest extends IPayloadRequest<SolicitudAyuda> {

	private List<SolicitudAyuda> objetos;

	private SolicitudAyuda objeto;

	public PayloadSolicitudAyudaRequest() {
		super();
	}

	@Override
	public List<SolicitudAyuda> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<SolicitudAyuda> objetos) {
		this.objetos = objetos;
	}

	@Override
	public SolicitudAyuda getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(SolicitudAyuda objeto) {
		this.objeto = objeto;
	}

}
