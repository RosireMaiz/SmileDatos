package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.VoluntarioProfesion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadVoluntarioProfesionRequest extends IPayloadRequest<VoluntarioProfesion> {

	private List<VoluntarioProfesion> objetos;

	private VoluntarioProfesion objeto;

	public PayloadVoluntarioProfesionRequest() {
		super();
	}

	@Override
	public List<VoluntarioProfesion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<VoluntarioProfesion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public VoluntarioProfesion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(VoluntarioProfesion objeto) {
		this.objeto = objeto;
	}

}
