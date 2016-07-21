package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ComenEventoPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadComenEventoPlanificadoRequest extends IPayloadRequest<ComenEventoPlanificado> {

	private List<ComenEventoPlanificado> objetos;

	private ComenEventoPlanificado objeto;

	public PayloadComenEventoPlanificadoRequest() {
		super();
	}

	@Override
	public List<ComenEventoPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ComenEventoPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ComenEventoPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ComenEventoPlanificado objeto) {
		this.objeto = objeto;
	}

}
