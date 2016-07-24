package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EtiqEventoPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEtiqEventoPlanificadoRequest extends IPayloadRequest<EtiqEventoPlanificado> {

	private List<EtiqEventoPlanificado> objetos;

	private EtiqEventoPlanificado objeto;

	public PayloadEtiqEventoPlanificadoRequest() {
		super();
	}

	@Override
	public List<EtiqEventoPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EtiqEventoPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EtiqEventoPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EtiqEventoPlanificado objeto) {
		this.objeto = objeto;
	}

}
