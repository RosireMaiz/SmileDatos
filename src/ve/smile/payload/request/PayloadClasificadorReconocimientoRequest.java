package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.ClasificadorReconocimiento;
import lights.core.payload.request.IPayloadRequest;

public class PayloadClasificadorReconocimientoRequest extends IPayloadRequest<ClasificadorReconocimiento> {

	private List<ClasificadorReconocimiento> objetos;

	private ClasificadorReconocimiento objeto;

	public PayloadClasificadorReconocimientoRequest() {
		super();
	}

	@Override
	public List<ClasificadorReconocimiento> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<ClasificadorReconocimiento> objetos) {
		this.objetos = objetos;
	}

	@Override
	public ClasificadorReconocimiento getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(ClasificadorReconocimiento objeto) {
		this.objeto = objeto;
	}

}
