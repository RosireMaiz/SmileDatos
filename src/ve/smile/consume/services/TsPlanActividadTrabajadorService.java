package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanActividadTrabajador;
import ve.smile.payload.request.PayloadTsPlanActividadTrabajadorRequest;
import ve.smile.payload.response.PayloadTsPlanActividadTrabajadorResponse;

@Consume("TsPlanActividadTrabajadorService")
public class TsPlanActividadTrabajadorService extends IService<PayloadTsPlanActividadTrabajadorResponse, PayloadTsPlanActividadTrabajadorRequest, TsPlanActividadTrabajador> {

}
