package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorCapacitacion;
import ve.smile.payload.request.PayloadClasificadorCapacitacionRequest;
import ve.smile.payload.response.PayloadClasificadorCapacitacionResponse;

@Consume("ClasificadorCapacitacionService")
public class ClasificadorCapacitacionService extends IService<PayloadClasificadorCapacitacionResponse, PayloadClasificadorCapacitacionRequest, ClasificadorCapacitacion> {

}
