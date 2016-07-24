package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoTarea;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoTareaRequest extends IPayloadRequest<TipoTarea> {

	private List<TipoTarea> objetos;

	private TipoTarea objeto;

	public PayloadTipoTareaRequest() {
		super();
	}

	@Override
	public List<TipoTarea> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoTarea> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoTarea getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoTarea objeto) {
		this.objeto = objeto;
	}

}
