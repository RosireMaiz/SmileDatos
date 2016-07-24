package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EstudioSocioEconomico;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEstudioSocioEconomicoRequest extends IPayloadRequest<EstudioSocioEconomico> {

	private List<EstudioSocioEconomico> objetos;

	private EstudioSocioEconomico objeto;

	public PayloadEstudioSocioEconomicoRequest() {
		super();
	}

	@Override
	public List<EstudioSocioEconomico> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EstudioSocioEconomico> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EstudioSocioEconomico getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EstudioSocioEconomico objeto) {
		this.objeto = objeto;
	}

}
