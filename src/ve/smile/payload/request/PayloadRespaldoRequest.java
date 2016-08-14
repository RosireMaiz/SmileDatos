package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Respaldo;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRespaldoRequest extends IPayloadRequest<Respaldo> {

	private List<Respaldo> objetos;

	private Respaldo objeto;

	public PayloadRespaldoRequest() {
		super();
	}

	@Override
	public List<Respaldo> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Respaldo> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Respaldo getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Respaldo objeto) {
		this.objeto = objeto;
	}

}
