package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Sesion;
import ve.smile.payload.request.PayloadSesionRequest;
import ve.smile.payload.response.PayloadSesionResponse;

@Consume("SesionService")
public class SesionService extends IService<PayloadSesionResponse, PayloadSesionRequest, Sesion> {

}
