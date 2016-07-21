package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.VoluntarioFortaleza;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVoluntarioFortalezaRequest extends IPayloadRequest<VoluntarioFortaleza> {

	private List<VoluntarioFortaleza> objetos;

	private VoluntarioFortaleza objeto;

	public PayloadVoluntarioFortalezaRequest() {
		super();
	}

	@Override
	public List<VoluntarioFortaleza> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VoluntarioFortaleza> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VoluntarioFortaleza getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VoluntarioFortaleza objeto) {
		this.objeto = objeto;
	}

}
