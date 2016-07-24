package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.DonativoCuentaBancaria;
import lights.core.payload.request.IPayloadRequest;

public class PayloadDonativoCuentaBancariaRequest extends IPayloadRequest<DonativoCuentaBancaria> {

	private List<DonativoCuentaBancaria> objetos;

	private DonativoCuentaBancaria objeto;

	public PayloadDonativoCuentaBancariaRequest() {
		super();
	}

	@Override
	public List<DonativoCuentaBancaria> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<DonativoCuentaBancaria> objetos) {
		this.objetos = objetos;
	}

	@Override
	public DonativoCuentaBancaria getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(DonativoCuentaBancaria objeto) {
		this.objeto = objeto;
	}

}
