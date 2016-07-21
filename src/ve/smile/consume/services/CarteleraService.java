package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Cartelera;
import ve.smile.payload.request.PayloadCarteleraRequest;
import ve.smile.payload.response.PayloadCarteleraResponse;

@Consume("CarteleraService")
public class CarteleraService extends IService<PayloadCarteleraResponse, PayloadCarteleraRequest, Cartelera> {

}
