package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Etiqueta;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEtiquetaRequest extends IPayloadRequest<Etiqueta> {

	private List<Etiqueta> objetos;

	private Etiqueta objeto;

	public PayloadEtiquetaRequest() {
		super();
	}

	@Override
	public List<Etiqueta> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Etiqueta> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Etiqueta getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Etiqueta objeto) {
		this.objeto = objeto;
	}

}
