package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanActividad;
import ve.smile.payload.request.PayloadTsPlanActividadRequest;
import ve.smile.payload.response.PayloadTsPlanActividadResponse;

@Consume("TsPlanActividadService")
public class TsPlanActividadService extends IService<PayloadTsPlanActividadResponse, PayloadTsPlanActividadRequest, TsPlanActividad> {

}
