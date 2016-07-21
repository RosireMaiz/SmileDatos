package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MetaTsPlanActividad;
import ve.smile.payload.request.PayloadMetaTsPlanActividadRequest;
import ve.smile.payload.response.PayloadMetaTsPlanActividadResponse;

@Consume("MetaTsPlanActividadService")
public class MetaTsPlanActividadService extends IService<PayloadMetaTsPlanActividadResponse, PayloadMetaTsPlanActividadRequest, MetaTsPlanActividad> {

}
