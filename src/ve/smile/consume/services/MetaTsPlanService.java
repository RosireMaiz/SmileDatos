package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MetaTsPlan;
import ve.smile.payload.request.PayloadMetaTsPlanRequest;
import ve.smile.payload.response.PayloadMetaTsPlanResponse;

@Consume("MetaTsPlanService")
public class MetaTsPlanService extends IService<PayloadMetaTsPlanResponse, PayloadMetaTsPlanRequest, MetaTsPlan> {

}
