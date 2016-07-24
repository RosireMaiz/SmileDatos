package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.RequisitoParticipacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRequisitoParticipacionRequest extends IPayloadRequest<RequisitoParticipacion> {

	private List<RequisitoParticipacion> objetos;

	private RequisitoParticipacion objeto;

	public PayloadRequisitoParticipacionRequest() {
		super();
	}

	@Override
	public List<RequisitoParticipacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RequisitoParticipacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public RequisitoParticipacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(RequisitoParticipacion objeto) {
		this.objeto = objeto;
	}

}
