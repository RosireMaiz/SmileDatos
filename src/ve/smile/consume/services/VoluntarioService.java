package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Voluntario;
import ve.smile.payload.request.PayloadVoluntarioRequest;
import ve.smile.payload.response.PayloadVoluntarioResponse;

@Consume("VoluntarioService")
public class VoluntarioService extends IService<PayloadVoluntarioResponse, PayloadVoluntarioRequest, Voluntario> {

}
