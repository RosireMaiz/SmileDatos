package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanVoluntario;
import ve.smile.payload.request.PayloadTsPlanVoluntarioRequest;
import ve.smile.payload.response.PayloadTsPlanVoluntarioResponse;

@Consume("TsPlanVoluntarioService")
public class TsPlanVoluntarioService extends IService<PayloadTsPlanVoluntarioResponse, PayloadTsPlanVoluntarioRequest, TsPlanVoluntario> {

}
