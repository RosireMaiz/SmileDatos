package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Patrocinador;
import lights.core.payload.request.IPayloadRequest;

public class PayloadPatrocinadorRequest extends IPayloadRequest<Patrocinador> {

	private List<Patrocinador> objetos;

	private Patrocinador objeto;

	public PayloadPatrocinadorRequest() {
		super();
	}

	@Override
	public List<Patrocinador> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Patrocinador> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Patrocinador getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Patrocinador objeto) {
		this.objeto = objeto;
	}

}
