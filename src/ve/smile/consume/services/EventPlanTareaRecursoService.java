package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanTareaRecurso;
import ve.smile.payload.request.PayloadEventPlanTareaRecursoRequest;
import ve.smile.payload.response.PayloadEventPlanTareaRecursoResponse;

@Consume("EventPlanTareaRecursoService")
public class EventPlanTareaRecursoService extends IService<PayloadEventPlanTareaRecursoResponse, PayloadEventPlanTareaRecursoRequest, EventPlanTareaRecurso> {

}
