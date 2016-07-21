package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorMotivo;
import ve.smile.payload.request.PayloadClasificadorMotivoRequest;
import ve.smile.payload.response.PayloadClasificadorMotivoResponse;

@Consume("ClasificadorMotivoService")
public class ClasificadorMotivoService extends IService<PayloadClasificadorMotivoResponse, PayloadClasificadorMotivoRequest, ClasificadorMotivo> {

}
