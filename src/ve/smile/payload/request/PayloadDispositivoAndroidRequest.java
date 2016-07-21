package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.DispositivoAndroid;
import lights.core.payload.request.IPayloadRequest;

public class PayloadDispositivoAndroidRequest extends IPayloadRequest<DispositivoAndroid> {

	private List<DispositivoAndroid> objetos;

	private DispositivoAndroid objeto;

	public PayloadDispositivoAndroidRequest() {
		super();
	}

	@Override
	public List<DispositivoAndroid> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<DispositivoAndroid> objetos) {
		this.objetos = objetos;
	}

	@Override
	public DispositivoAndroid getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(DispositivoAndroid objeto) {
		this.objeto = objeto;
	}

}
