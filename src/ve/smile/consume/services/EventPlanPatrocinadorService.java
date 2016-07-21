package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanPatrocinador;
import ve.smile.payload.request.PayloadEventPlanPatrocinadorRequest;
import ve.smile.payload.response.PayloadEventPlanPatrocinadorResponse;

@Consume("EventPlanPatrocinadorService")
public class EventPlanPatrocinadorService extends IService<PayloadEventPlanPatrocinadorResponse, PayloadEventPlanPatrocinadorRequest, EventPlanPatrocinador> {

}
