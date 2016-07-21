package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.Beneficiario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadBeneficiarioRequest extends IPayloadRequest<Beneficiario> {

	private List<Beneficiario> objetos;

	private Beneficiario objeto;

	public PayloadBeneficiarioRequest() {
		super();
	}

	@Override
	public List<Beneficiario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<Beneficiario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public Beneficiario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(Beneficiario objeto) {
		this.objeto = objeto;
	}

}
