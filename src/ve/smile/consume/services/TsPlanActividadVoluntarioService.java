package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanActividadVoluntario;
import ve.smile.payload.request.PayloadTsPlanActividadVoluntarioRequest;
import ve.smile.payload.response.PayloadTsPlanActividadVoluntarioResponse;

@Consume("TsPlanActividadVoluntarioService")
public class TsPlanActividadVoluntarioService extends IService<PayloadTsPlanActividadVoluntarioResponse, PayloadTsPlanActividadVoluntarioRequest, TsPlanActividadVoluntario> {

}
