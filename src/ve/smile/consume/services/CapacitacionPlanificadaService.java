package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.CapacitacionPlanificada;
import ve.smile.payload.request.PayloadCapacitacionPlanificadaRequest;
import ve.smile.payload.response.PayloadCapacitacionPlanificadaResponse;

@Consume("CapacitacionPlanificadaService")
public class CapacitacionPlanificadaService extends IService<PayloadCapacitacionPlanificadaResponse, PayloadCapacitacionPlanificadaRequest, CapacitacionPlanificada> {

}
