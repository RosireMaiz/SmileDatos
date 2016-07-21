package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MetaEventPlanificado;
import ve.smile.payload.request.PayloadMetaEventPlanificadoRequest;
import ve.smile.payload.response.PayloadMetaEventPlanificadoResponse;

@Consume("MetaEventPlanificadoService")
public class MetaEventPlanificadoService extends IService<PayloadMetaEventPlanificadoResponse, PayloadMetaEventPlanificadoRequest, MetaEventPlanificado> {

}
