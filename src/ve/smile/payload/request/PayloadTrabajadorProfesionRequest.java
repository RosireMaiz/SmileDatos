package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.TrabajadorProfesion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTrabajadorProfesionRequest extends IPayloadRequest<TrabajadorProfesion> {

	private List<TrabajadorProfesion> objetos;

	private TrabajadorProfesion objeto;

	public PayloadTrabajadorProfesionRequest() {
		super();
	}

	@Override
	public List<TrabajadorProfesion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<TrabajadorProfesion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public TrabajadorProfesion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(TrabajadorProfesion objeto) {
		this.objeto = objeto;
	}

}
