package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanVoluntario;
import ve.smile.payload.request.PayloadEventPlanVoluntarioRequest;
import ve.smile.payload.response.PayloadEventPlanVoluntarioResponse;

@Consume("EventPlanVoluntarioService")
public class EventPlanVoluntarioService extends IService<PayloadEventPlanVoluntarioResponse, PayloadEventPlanVoluntarioRequest, EventPlanVoluntario> {

}
