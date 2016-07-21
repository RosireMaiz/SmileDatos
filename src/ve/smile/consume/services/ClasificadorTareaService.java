package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorTarea;
import ve.smile.payload.request.PayloadClasificadorTareaRequest;
import ve.smile.payload.response.PayloadClasificadorTareaResponse;

@Consume("ClasificadorTareaService")
public class ClasificadorTareaService extends IService<PayloadClasificadorTareaResponse, PayloadClasificadorTareaRequest, ClasificadorTarea> {

}
