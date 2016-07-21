package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Beneficiario;
import ve.smile.payload.request.PayloadBeneficiarioRequest;
import ve.smile.payload.response.PayloadBeneficiarioResponse;

@Consume("BeneficiarioService")
public class BeneficiarioService extends IService<PayloadBeneficiarioResponse, PayloadBeneficiarioRequest, Beneficiario> {

}
