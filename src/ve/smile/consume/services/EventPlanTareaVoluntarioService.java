package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanTareaVoluntario;
import ve.smile.payload.request.PayloadEventPlanTareaVoluntarioRequest;
import ve.smile.payload.response.PayloadEventPlanTareaVoluntarioResponse;

@Consume("EventPlanTareaVoluntarioService")
public class EventPlanTareaVoluntarioService extends IService<PayloadEventPlanTareaVoluntarioResponse, PayloadEventPlanTareaVoluntarioRequest, EventPlanTareaVoluntario> {

}
