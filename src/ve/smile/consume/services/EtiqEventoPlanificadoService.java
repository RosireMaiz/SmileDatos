package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EtiqEventoPlanificado;
import ve.smile.payload.request.PayloadEtiqEventoPlanificadoRequest;
import ve.smile.payload.response.PayloadEtiqEventoPlanificadoResponse;

@Consume("EtiqEventoPlanificadoService")
public class EtiqEventoPlanificadoService extends IService<PayloadEtiqEventoPlanificadoResponse, PayloadEtiqEventoPlanificadoRequest, EtiqEventoPlanificado> {

}
