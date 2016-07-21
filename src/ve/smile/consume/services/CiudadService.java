package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Ciudad;
import ve.smile.payload.request.PayloadCiudadRequest;
import ve.smile.payload.response.PayloadCiudadResponse;

@Consume("CiudadService")
public class CiudadService extends IService<PayloadCiudadResponse, PayloadCiudadRequest, Ciudad> {

}
