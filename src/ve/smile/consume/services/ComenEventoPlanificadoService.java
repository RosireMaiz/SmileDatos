package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ComenEventoPlanificado;
import ve.smile.payload.request.PayloadComenEventoPlanificadoRequest;
import ve.smile.payload.response.PayloadComenEventoPlanificadoResponse;

@Consume("ComenEventoPlanificadoService")
public class ComenEventoPlanificadoService extends IService<PayloadComenEventoPlanificadoResponse, PayloadComenEventoPlanificadoRequest, ComenEventoPlanificado> {

}
