package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Ayuda;
import ve.smile.payload.request.PayloadAyudaRequest;
import ve.smile.payload.response.PayloadAyudaResponse;

@Consume("AyudaService")
public class AyudaService extends IService<PayloadAyudaResponse, PayloadAyudaRequest, Ayuda> {

}
