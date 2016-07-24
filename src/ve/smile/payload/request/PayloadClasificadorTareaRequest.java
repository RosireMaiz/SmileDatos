package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorTareaRequest extends IPayloadRequest<ClasificadorTarea> {

	private List<ClasificadorTarea> objetos;

	private ClasificadorTarea objeto;

	public PayloadClasificadorTareaRequest() {
		super();
	}

	@Override
	public List<ClasificadorTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorTarea objeto) {
		this.objeto = objeto;
	}

}
