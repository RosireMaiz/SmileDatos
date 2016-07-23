package ve.smile.seguridad.payload.request;

import java.util.List;

import ve.smile.seguridad.dto.Tabla;
import lights.core.payload.request.IPayloadRequest;

public class PayloadTablaRequest extends IPayloadRequest<Tabla> {

	private List<Tabla> objetos;

	private Tabla objeto;

	public PayloadTablaRequest() {
		super();
	}

	@Override
	public List<Tabla> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Tabla> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Tabla getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Tabla objeto) {
		this.objeto = objeto;
	}

}
