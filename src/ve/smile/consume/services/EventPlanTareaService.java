package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanTarea;
import ve.smile.payload.request.PayloadEventPlanTareaRequest;
import ve.smile.payload.response.PayloadEventPlanTareaResponse;

@Consume("EventPlanTareaService")
public class EventPlanTareaService extends IService<PayloadEventPlanTareaResponse, PayloadEventPlanTareaRequest, EventPlanTarea> {

}
