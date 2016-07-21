package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.SolicitudAyudaRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadSolicitudAyudaRecursoRequest extends IPayloadRequest<SolicitudAyudaRecurso> {

	private List<SolicitudAyudaRecurso> objetos;

	private SolicitudAyudaRecurso objeto;

	public PayloadSolicitudAyudaRecursoRequest() {
		super();
	}

	@Override
	public List<SolicitudAyudaRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<SolicitudAyudaRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public SolicitudAyudaRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(SolicitudAyudaRecurso objeto) {
		this.objeto = objeto;
	}

}
