package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.CuentaBancaria;
import lights.core.payload.request.IPayloadRequest;

public class PayloadCuentaBancariaRequest extends IPayloadRequest<CuentaBancaria> {

	private List<CuentaBancaria> objetos;

	private CuentaBancaria objeto;

	public PayloadCuentaBancariaRequest() {
		super();
	}

	@Override
	public List<CuentaBancaria> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<CuentaBancaria> objetos) {
		this.objetos = objetos;
	}

	@Override
	public CuentaBancaria getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(CuentaBancaria objeto) {
		this.objeto = objeto;
	}

}
