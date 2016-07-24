package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Configuracion;
import lights.core.payload.request.IPayloadRequest;

public class PayloadConfiguracionRequest extends IPayloadRequest<Configuracion> {

	private List<Configuracion> objetos;

	private Configuracion objeto;

	public PayloadConfiguracionRequest() {
		super();
	}

	@Override
	public List<Configuracion> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Configuracion> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Configuracion getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Configuracion objeto) {
		this.objeto = objeto;
	}

}
