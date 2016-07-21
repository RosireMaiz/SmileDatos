package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EtiqTsPlanificado;
import ve.smile.payload.request.PayloadEtiqTsPlanificadoRequest;
import ve.smile.payload.response.PayloadEtiqTsPlanificadoResponse;

@Consume("EtiqTsPlanificadoService")
public class EtiqTsPlanificadoService extends IService<PayloadEtiqTsPlanificadoResponse, PayloadEtiqTsPlanificadoRequest, EtiqTsPlanificado> {

}
