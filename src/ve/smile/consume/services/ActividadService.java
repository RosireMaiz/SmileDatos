package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Actividad;
import ve.smile.payload.request.PayloadActividadRequest;
import ve.smile.payload.response.PayloadActividadResponse;

@Consume("ActividadService")
public class ActividadService extends IService<PayloadActividadResponse, PayloadActividadRequest, Actividad> {

}
