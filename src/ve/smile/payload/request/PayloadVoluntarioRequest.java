package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Voluntario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVoluntarioRequest extends IPayloadRequest<Voluntario> {

	private List<Voluntario> objetos;

	private Voluntario objeto;

	public PayloadVoluntarioRequest() {
		super();
	}

	@Override
	public List<Voluntario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Voluntario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Voluntario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Voluntario objeto) {
		this.objeto = objeto;
	}

}
