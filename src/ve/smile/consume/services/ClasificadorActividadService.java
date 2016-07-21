package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorActividad;
import ve.smile.payload.request.PayloadClasificadorActividadRequest;
import ve.smile.payload.response.PayloadClasificadorActividadResponse;

@Consume("ClasificadorActividadService")
public class ClasificadorActividadService extends IService<PayloadClasificadorActividadResponse, PayloadClasificadorActividadRequest, ClasificadorActividad> {

}
