package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorEvento;
import ve.smile.payload.request.PayloadClasificadorEventoRequest;
import ve.smile.payload.response.PayloadClasificadorEventoResponse;

@Consume("ClasificadorEventoService")
public class ClasificadorEventoService extends IService<PayloadClasificadorEventoResponse, PayloadClasificadorEventoRequest, ClasificadorEvento> {

}
