package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.FrecuenciaAporte;
import lights.core.payload.request.IPayloadRequest;

public class PayloadFrecuenciaAporteRequest extends IPayloadRequest<FrecuenciaAporte> {

	private List<FrecuenciaAporte> objetos;

	private FrecuenciaAporte objeto;

	public PayloadFrecuenciaAporteRequest() {
		super();
	}

	@Override
	public List<FrecuenciaAporte> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<FrecuenciaAporte> objetos) {
		this.objetos = objetos;
	}

	@Override
	public FrecuenciaAporte getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(FrecuenciaAporte objeto) {
		this.objeto = objeto;
	}

}
