package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.CarteleraEtiqueta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCarteleraEtiquetaRequest extends IPayloadRequest<CarteleraEtiqueta> {

	private List<CarteleraEtiqueta> objetos;

	private CarteleraEtiqueta objeto;

	public PayloadCarteleraEtiquetaRequest() {
		super();
	}

	@Override
	public List<CarteleraEtiqueta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<CarteleraEtiqueta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public CarteleraEtiqueta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(CarteleraEtiqueta objeto) {
		this.objeto = objeto;
	}

}
