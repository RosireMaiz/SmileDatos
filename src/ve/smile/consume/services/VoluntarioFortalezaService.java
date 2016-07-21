package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VoluntarioFortaleza;
import ve.smile.payload.request.PayloadVoluntarioFortalezaRequest;
import ve.smile.payload.response.PayloadVoluntarioFortalezaResponse;

@Consume("VoluntarioFortalezaService")
public class VoluntarioFortalezaService extends IService<PayloadVoluntarioFortalezaResponse, PayloadVoluntarioFortalezaRequest, VoluntarioFortaleza> {

}
