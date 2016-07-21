package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TrabajadorFortaleza;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTrabajadorFortalezaRequest extends IPayloadRequest<TrabajadorFortaleza> {

	private List<TrabajadorFortaleza> objetos;

	private TrabajadorFortaleza objeto;

	public PayloadTrabajadorFortalezaRequest() {
		super();
	}

	@Override
	public List<TrabajadorFortaleza> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TrabajadorFortaleza> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TrabajadorFortaleza getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TrabajadorFortaleza objeto) {
		this.objeto = objeto;
	}

}
