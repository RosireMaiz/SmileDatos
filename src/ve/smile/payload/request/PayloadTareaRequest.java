package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Tarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTareaRequest extends IPayloadRequest<Tarea> {

	private List<Tarea> objetos;

	private Tarea objeto;

	public PayloadTareaRequest() {
		super();
	}

	@Override
	public List<Tarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Tarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Tarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Tarea objeto) {
		this.objeto = objeto;
	}

}
