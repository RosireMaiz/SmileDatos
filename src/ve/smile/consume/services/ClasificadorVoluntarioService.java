package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorVoluntario;
import ve.smile.payload.request.PayloadClasificadorVoluntarioRequest;
import ve.smile.payload.response.PayloadClasificadorVoluntarioResponse;

@Consume("ClasificadorVoluntarioService")
public class ClasificadorVoluntarioService extends IService<PayloadClasificadorVoluntarioResponse, PayloadClasificadorVoluntarioRequest, ClasificadorVoluntario> {

}
