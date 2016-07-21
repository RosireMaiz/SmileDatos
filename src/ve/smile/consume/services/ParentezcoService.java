package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Parentezco;
import ve.smile.payload.request.PayloadParentezcoRequest;
import ve.smile.payload.response.PayloadParentezcoResponse;

@Consume("ParentezcoService")
public class ParentezcoService extends IService<PayloadParentezcoResponse, PayloadParentezcoRequest, Parentezco> {

}
