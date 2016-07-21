package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TsPlanActividadTrabajador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTsPlanActividadTrabajadorRequest extends IPayloadRequest<TsPlanActividadTrabajador> {

	private List<TsPlanActividadTrabajador> objetos;

	private TsPlanActividadTrabajador objeto;

	public PayloadTsPlanActividadTrabajadorRequest() {
		super();
	}

	@Override
	public List<TsPlanActividadTrabajador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TsPlanActividadTrabajador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TsPlanActividadTrabajador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TsPlanActividadTrabajador objeto) {
		this.objeto = objeto;
	}

}
