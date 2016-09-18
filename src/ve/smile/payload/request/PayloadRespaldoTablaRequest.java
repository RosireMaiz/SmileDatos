package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.RespaldoTabla;
import lights.core.payload.request.IPayloadRequest;

public class PayloadRespaldoTablaRequest extends IPayloadRequest<RespaldoTabla> {

	private List<RespaldoTabla> objetos;

	private RespaldoTabla objeto;

	public PayloadRespaldoTablaRequest() {
		super();
	}

	@Override
	public List<RespaldoTabla> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<RespaldoTabla> objetos) {
		this.objetos = objetos;
	}

	@Override
	public RespaldoTabla getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(RespaldoTabla objeto) {
		this.objeto = objeto;
	}

}
