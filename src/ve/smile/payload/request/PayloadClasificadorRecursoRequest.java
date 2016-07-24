package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorRecurso;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorRecursoRequest extends IPayloadRequest<ClasificadorRecurso> {

	private List<ClasificadorRecurso> objetos;

	private ClasificadorRecurso objeto;

	public PayloadClasificadorRecursoRequest() {
		super();
	}

	@Override
	public List<ClasificadorRecurso> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorRecurso> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorRecurso getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorRecurso objeto) {
		this.objeto = objeto;
	}

}
