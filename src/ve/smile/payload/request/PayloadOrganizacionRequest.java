package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Organizacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadOrganizacionRequest extends IPayloadRequest<Organizacion> {

	private List<Organizacion> objetos;

	private Organizacion objeto;

	public PayloadOrganizacionRequest() {
		super();
	}

	@Override
	public List<Organizacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Organizacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Organizacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Organizacion objeto) {
		this.objeto = objeto;
	}

}
