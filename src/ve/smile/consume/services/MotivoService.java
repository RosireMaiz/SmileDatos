package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Motivo;
import ve.smile.payload.request.PayloadMotivoRequest;
import ve.smile.payload.response.PayloadMotivoResponse;

@Consume("MotivoService")
public class MotivoService extends IService<PayloadMotivoResponse, PayloadMotivoRequest, Motivo> {

}
