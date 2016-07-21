package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Participacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadParticipacionRequest extends IPayloadRequest<Participacion> {

	private List<Participacion> objetos;

	private Participacion objeto;

	public PayloadParticipacionRequest() {
		super();
	}

	@Override
	public List<Participacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Participacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Participacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Participacion objeto) {
		this.objeto = objeto;
	}

}
