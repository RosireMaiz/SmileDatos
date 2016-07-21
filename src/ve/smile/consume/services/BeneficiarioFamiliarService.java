package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.BeneficiarioFamiliar;
import ve.smile.payload.request.PayloadBeneficiarioFamiliarRequest;
import ve.smile.payload.response.PayloadBeneficiarioFamiliarResponse;

@Consume("BeneficiarioFamiliarService")
public class BeneficiarioFamiliarService extends IService<PayloadBeneficiarioFamiliarResponse, PayloadBeneficiarioFamiliarRequest, BeneficiarioFamiliar> {

}
