package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Colaborador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadColaboradorRequest extends IPayloadRequest<Colaborador> {

	private List<Colaborador> objetos;

	private Colaborador objeto;

	public PayloadColaboradorRequest() {
		super();
	}

	@Override
	public List<Colaborador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Colaborador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Colaborador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Colaborador objeto) {
		this.objeto = objeto;
	}

}
