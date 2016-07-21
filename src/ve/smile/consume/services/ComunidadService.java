package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Comunidad;
import ve.smile.payload.request.PayloadComunidadRequest;
import ve.smile.payload.response.PayloadComunidadResponse;

@Consume("ComunidadService")
public class ComunidadService extends IService<PayloadComunidadResponse, PayloadComunidadRequest, Comunidad> {

}
