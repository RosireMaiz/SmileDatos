package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VolCapacitacionPlanificada;
import ve.smile.payload.request.PayloadVolCapacitacionPlanificadaRequest;
import ve.smile.payload.response.PayloadVolCapacitacionPlanificadaResponse;

@Consume("VolCapacitacionPlanificadaService")
public class VolCapacitacionPlanificadaService extends IService<PayloadVolCapacitacionPlanificadaResponse, PayloadVolCapacitacionPlanificadaRequest, VolCapacitacionPlanificada> {

}
