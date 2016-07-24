package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EtiqTsPlanificado;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEtiqTsPlanificadoRequest extends IPayloadRequest<EtiqTsPlanificado> {

	private List<EtiqTsPlanificado> objetos;

	private EtiqTsPlanificado objeto;

	public PayloadEtiqTsPlanificadoRequest() {
		super();
	}

	@Override
	public List<EtiqTsPlanificado> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EtiqTsPlanificado> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EtiqTsPlanificado getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EtiqTsPlanificado objeto) {
		this.objeto = objeto;
	}

}
