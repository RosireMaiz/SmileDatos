package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IndicadorTsPlan;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIndicadorTsPlanRequest extends IPayloadRequest<IndicadorTsPlan> {

	private List<IndicadorTsPlan> objetos;

	private IndicadorTsPlan objeto;

	public PayloadIndicadorTsPlanRequest() {
		super();
	}

	@Override
	public List<IndicadorTsPlan> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IndicadorTsPlan> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IndicadorTsPlan getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IndicadorTsPlan objeto) {
		this.objeto = objeto;
	}

}
