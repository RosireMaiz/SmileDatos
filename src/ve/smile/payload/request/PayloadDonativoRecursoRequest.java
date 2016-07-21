package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.DonativoRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadDonativoRecursoRequest extends IPayloadRequest<DonativoRecurso> {

	private List<DonativoRecurso> objetos;

	private DonativoRecurso objeto;

	public PayloadDonativoRecursoRequest() {
		super();
	}

	@Override
	public List<DonativoRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<DonativoRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public DonativoRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(DonativoRecurso objeto) {
		this.objeto = objeto;
	}

}
