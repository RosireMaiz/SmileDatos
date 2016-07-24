package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Capacitacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCapacitacionRequest extends IPayloadRequest<Capacitacion> {

	private List<Capacitacion> objetos;

	private Capacitacion objeto;

	public PayloadCapacitacionRequest() {
		super();
	}

	@Override
	public List<Capacitacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Capacitacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Capacitacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Capacitacion objeto) {
		this.objeto = objeto;
	}

}
