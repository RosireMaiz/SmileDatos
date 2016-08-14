package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.IndicadorEventoPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIndicadorEventoPlanificadoRequest extends IPayloadRequest<IndicadorEventoPlanificado> {

	private List<IndicadorEventoPlanificado> objetos;

	private IndicadorEventoPlanificado objeto;

	public PayloadIndicadorEventoPlanificadoRequest() {
		super();
	}

	@Override
	public List<IndicadorEventoPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IndicadorEventoPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IndicadorEventoPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IndicadorEventoPlanificado objeto) {
		this.objeto = objeto;
	}

}
