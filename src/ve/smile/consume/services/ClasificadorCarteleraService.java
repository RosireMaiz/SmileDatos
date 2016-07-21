package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorCartelera;
import ve.smile.payload.request.PayloadClasificadorCarteleraRequest;
import ve.smile.payload.response.PayloadClasificadorCarteleraResponse;

@Consume("ClasificadorCarteleraService")
public class ClasificadorCarteleraService extends IService<PayloadClasificadorCarteleraResponse, PayloadClasificadorCarteleraRequest, ClasificadorCartelera> {

}
