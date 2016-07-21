package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Actividad;
import lights.core.payload.request.IPayloadRequest;

public class PayloadActividadRequest extends IPayloadRequest<Actividad> {

	private List<Actividad> objetos;

	private Actividad objeto;

	public PayloadActividadRequest() {
		super();
	}

	@Override
	public List<Actividad> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Actividad> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Actividad getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Actividad objeto) {
		this.objeto = objeto;
	}

}
