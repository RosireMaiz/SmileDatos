package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.MetodoDao;
import lights.core.payload.request.IPayloadRequest;

public class PayloadMetodoDaoRequest extends IPayloadRequest<MetodoDao> {

	private List<MetodoDao> objetos;

	private MetodoDao objeto;

	public PayloadMetodoDaoRequest() {
		super();
	}

	@Override
	public List<MetodoDao> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<MetodoDao> objetos) {
		this.objetos = objetos;
	}

	@Override
	public MetodoDao getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(MetodoDao objeto) {
		this.objeto = objeto;
	}

}
