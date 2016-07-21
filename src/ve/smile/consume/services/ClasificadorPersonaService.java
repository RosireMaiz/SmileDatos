package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorPersona;
import ve.smile.payload.request.PayloadClasificadorPersonaRequest;
import ve.smile.payload.response.PayloadClasificadorPersonaResponse;

@Consume("ClasificadorPersonaService")
public class ClasificadorPersonaService extends IService<PayloadClasificadorPersonaResponse, PayloadClasificadorPersonaRequest, ClasificadorPersona> {

}
