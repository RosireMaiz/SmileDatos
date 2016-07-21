package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TrabajadorFortaleza;
import ve.smile.payload.request.PayloadTrabajadorFortalezaRequest;
import ve.smile.payload.response.PayloadTrabajadorFortalezaResponse;

@Consume("TrabajadorFortalezaService")
public class TrabajadorFortalezaService extends IService<PayloadTrabajadorFortalezaResponse, PayloadTrabajadorFortalezaRequest, TrabajadorFortaleza> {

}
