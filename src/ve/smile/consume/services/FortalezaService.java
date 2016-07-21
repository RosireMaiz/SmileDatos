package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Fortaleza;
import ve.smile.payload.request.PayloadFortalezaRequest;
import ve.smile.payload.response.PayloadFortalezaResponse;

@Consume("FortalezaService")
public class FortalezaService extends IService<PayloadFortalezaResponse, PayloadFortalezaRequest, Fortaleza> {

}
