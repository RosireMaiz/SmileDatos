package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Indicador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIndicadorRequest extends IPayloadRequest<Indicador> {

	private List<Indicador> objetos;

	private Indicador objeto;

	public PayloadIndicadorRequest() {
		super();
	}

	@Override
	public List<Indicador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Indicador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Indicador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Indicador objeto) {
		this.objeto = objeto;
	}

}
