package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Recurso;
import ve.smile.payload.request.PayloadRecursoRequest;
import ve.smile.payload.response.PayloadRecursoResponse;

@Consume("RecursoService")
public class RecursoService extends IService<PayloadRecursoResponse, PayloadRecursoRequest, Recurso> {

}
