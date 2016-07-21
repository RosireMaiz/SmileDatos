package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Familiar;
import ve.smile.payload.request.PayloadFamiliarRequest;
import ve.smile.payload.response.PayloadFamiliarResponse;

@Consume("FamiliarService")
public class FamiliarService extends IService<PayloadFamiliarResponse, PayloadFamiliarRequest, Familiar> {

}
