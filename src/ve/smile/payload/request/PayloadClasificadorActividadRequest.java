package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorActividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorActividadRequest extends IPayloadRequest<ClasificadorActividad> {

	private List<ClasificadorActividad> objetos;

	private ClasificadorActividad objeto;

	public PayloadClasificadorActividadRequest() {
		super();
	}

	@Override
	public List<ClasificadorActividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorActividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorActividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorActividad objeto) {
		this.objeto = objeto;
	}

}
