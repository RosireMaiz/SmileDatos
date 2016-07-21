package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MetaEventPlanificadoTarea;
import ve.smile.payload.request.PayloadMetaEventPlanificadoTareaRequest;
import ve.smile.payload.response.PayloadMetaEventPlanificadoTareaResponse;

@Consume("MetaEventPlanificadoTareaService")
public class MetaEventPlanificadoTareaService extends IService<PayloadMetaEventPlanificadoTareaResponse, PayloadMetaEventPlanificadoTareaRequest, MetaEventPlanificadoTarea> {

}
