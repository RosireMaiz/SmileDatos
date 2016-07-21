package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TrabajadorProfesion;
import ve.smile.payload.request.PayloadTrabajadorProfesionRequest;
import ve.smile.payload.response.PayloadTrabajadorProfesionResponse;

@Consume("TrabajadorProfesionService")
public class TrabajadorProfesionService extends IService<PayloadTrabajadorProfesionResponse, PayloadTrabajadorProfesionRequest, TrabajadorProfesion> {

}
