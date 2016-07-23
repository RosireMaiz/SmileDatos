package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Operacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadOperacionRequest extends IPayloadRequest<Operacion> {

	private List<Operacion> objetos;

	private Operacion objeto;

	public PayloadOperacionRequest() {
		super();
	}

	@Override
	public List<Operacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Operacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Operacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Operacion objeto) {
		this.objeto = objeto;
	}
}
