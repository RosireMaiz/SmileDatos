package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorCapacitacion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorCapacitacionRequest extends IPayloadRequest<ClasificadorCapacitacion> {

	private List<ClasificadorCapacitacion> objetos;

	private ClasificadorCapacitacion objeto;

	public PayloadClasificadorCapacitacionRequest() {
		super();
	}

	@Override
	public List<ClasificadorCapacitacion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorCapacitacion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorCapacitacion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorCapacitacion objeto) {
		this.objeto = objeto;
	}

}
