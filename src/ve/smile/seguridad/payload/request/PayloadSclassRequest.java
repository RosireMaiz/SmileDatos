package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Sclass;
import lights.core.payload.request.IPayloadRequest;

public class PayloadSclassRequest extends IPayloadRequest<Sclass> {

	private List<Sclass> objetos;

	private Sclass objeto;

	public PayloadSclassRequest() {
		super();
	}

	@Override
	public List<Sclass> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Sclass> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Sclass getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Sclass objeto) {
		this.objeto = objeto;
	}

}
