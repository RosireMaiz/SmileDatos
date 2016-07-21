package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Trabajador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTrabajadorRequest extends IPayloadRequest<Trabajador> {

	private List<Trabajador> objetos;

	private Trabajador objeto;

	public PayloadTrabajadorRequest() {
		super();
	}

	@Override
	public List<Trabajador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Trabajador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Trabajador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Trabajador objeto) {
		this.objeto = objeto;
	}

}
