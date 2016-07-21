package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlan;
import ve.smile.payload.request.PayloadTsPlanRequest;
import ve.smile.payload.response.PayloadTsPlanResponse;

@Consume("TsPlanService")
public class TsPlanService extends IService<PayloadTsPlanResponse, PayloadTsPlanRequest, TsPlan> {

}
