package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanActividadRecurso;
import ve.smile.payload.request.PayloadTsPlanActividadRecursoRequest;
import ve.smile.payload.response.PayloadTsPlanActividadRecursoResponse;

@Consume("TsPlanActividadRecursoService")
public class TsPlanActividadRecursoService extends IService<PayloadTsPlanActividadRecursoResponse, PayloadTsPlanActividadRecursoRequest, TsPlanActividadRecurso> {

}
