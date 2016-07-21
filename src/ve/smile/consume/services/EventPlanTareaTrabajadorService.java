package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanTareaTrabajador;
import ve.smile.payload.request.PayloadEventPlanTareaTrabajadorRequest;
import ve.smile.payload.response.PayloadEventPlanTareaTrabajadorResponse;

@Consume("EventPlanTareaTrabajadorService")
public class EventPlanTareaTrabajadorService extends IService<PayloadEventPlanTareaTrabajadorResponse, PayloadEventPlanTareaTrabajadorRequest, EventPlanTareaTrabajador> {

}
