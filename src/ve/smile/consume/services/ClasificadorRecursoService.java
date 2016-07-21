package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorRecurso;
import ve.smile.payload.request.PayloadClasificadorRecursoRequest;
import ve.smile.payload.response.PayloadClasificadorRecursoResponse;

@Consume("ClasificadorRecursoService")
public class ClasificadorRecursoService extends IService<PayloadClasificadorRecursoResponse, PayloadClasificadorRecursoRequest, ClasificadorRecurso> {

}
