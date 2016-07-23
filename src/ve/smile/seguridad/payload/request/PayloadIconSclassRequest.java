package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.IconSclass;
import lights.core.payload.request.IPayloadRequest;

public class PayloadIconSclassRequest extends IPayloadRequest<IconSclass> {

	private List<IconSclass> objetos;

	private IconSclass objeto;

	public PayloadIconSclassRequest() {
		super();
	}

	@Override
	public List<IconSclass> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<IconSclass> objetos) {
		this.objetos = objetos;
	}

	@Override
	public IconSclass getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(IconSclass objeto) {
		this.objeto = objeto;
	}

}
