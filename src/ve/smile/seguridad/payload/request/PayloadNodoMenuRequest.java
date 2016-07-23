package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.NodoMenu;
import lights.core.payload.request.IPayloadRequest;

public class PayloadNodoMenuRequest extends IPayloadRequest<NodoMenu> {

	private List<NodoMenu> objetos;

	private NodoMenu objeto;

	public PayloadNodoMenuRequest() {
		super();
	}

	@Override
	public List<NodoMenu> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<NodoMenu> objetos) {
		this.objetos = objetos;
	}

	@Override
	public NodoMenu getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(NodoMenu objeto) {
		this.objeto = objeto;
	}

}
