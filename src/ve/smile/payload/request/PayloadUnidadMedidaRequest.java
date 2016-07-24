package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.UnidadMedida;
import lights.core.payload.request.IPayloadRequest;

public class PayloadUnidadMedidaRequest extends IPayloadRequest<UnidadMedida> {

	private List<UnidadMedida> objetos;

	private UnidadMedida objeto;

	public PayloadUnidadMedidaRequest() {
		super();
	}

	@Override
	public List<UnidadMedida> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<UnidadMedida> objetos) {
		this.objetos = objetos;
	}

	@Override
	public UnidadMedida getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(UnidadMedida objeto) {
		this.objeto = objeto;
	}

}
