package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Sclass;
import ve.smile.payload.request.PayloadSclassRequest;
import ve.smile.payload.response.PayloadSclassResponse;

@Consume("SclassService")
public class SclassService extends IService<PayloadSclassResponse, PayloadSclassRequest, Sclass> {

}
