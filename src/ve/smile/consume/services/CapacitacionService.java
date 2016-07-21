package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Capacitacion;
import ve.smile.payload.request.PayloadCapacitacionRequest;
import ve.smile.payload.response.PayloadCapacitacionResponse;

@Consume("CapacitacionService")
public class CapacitacionService extends IService<PayloadCapacitacionResponse, PayloadCapacitacionRequest, Capacitacion> {

}
