package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.BeneficiarioFamiliar;
import lights.core.payload.request.IPayloadRequest;

public class PayloadBeneficiarioFamiliarRequest extends IPayloadRequest<BeneficiarioFamiliar> {

	private List<BeneficiarioFamiliar> objetos;

	private BeneficiarioFamiliar objeto;

	public PayloadBeneficiarioFamiliarRequest() {
		super();
	}

	@Override
	public List<BeneficiarioFamiliar> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<BeneficiarioFamiliar> objetos) {
		this.objetos = objetos;
	}

	@Override
	public BeneficiarioFamiliar getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(BeneficiarioFamiliar objeto) {
		this.objeto = objeto;
	}

}
