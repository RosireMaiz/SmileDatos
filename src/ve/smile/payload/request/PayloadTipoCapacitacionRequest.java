package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TipoCapacitacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTipoCapacitacionRequest extends IPayloadRequest<TipoCapacitacion> {

	private List<TipoCapacitacion> objetos;

	private TipoCapacitacion objeto;

	public PayloadTipoCapacitacionRequest() {
		super();
	}

	@Override
	public List<TipoCapacitacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TipoCapacitacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TipoCapacitacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TipoCapacitacion objeto) {
		this.objeto = objeto;
	}

}
