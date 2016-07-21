package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoMotivo;
import ve.smile.payload.request.PayloadTipoMotivoRequest;
import ve.smile.payload.response.PayloadTipoMotivoResponse;

@Consume("TipoMotivoService")
public class TipoMotivoService extends IService<PayloadTipoMotivoResponse, PayloadTipoMotivoRequest, TipoMotivo> {

}
