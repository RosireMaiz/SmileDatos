package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Tarea;
import ve.smile.payload.request.PayloadTareaRequest;
import ve.smile.payload.response.PayloadTareaResponse;

@Consume("TareaService")
public class TareaService extends IService<PayloadTareaResponse, PayloadTareaRequest, Tarea> {

}
