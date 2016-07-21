package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Informacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadInformacionRequest extends IPayloadRequest<Informacion> {

	private List<Informacion> objetos;

	private Informacion objeto;

	public PayloadInformacionRequest() {
		super();
	}

	@Override
	public List<Informacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Informacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Informacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Informacion objeto) {
		this.objeto = objeto;
	}

}
