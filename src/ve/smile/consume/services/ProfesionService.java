package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Profesion;
import ve.smile.payload.request.PayloadProfesionRequest;
import ve.smile.payload.response.PayloadProfesionResponse;

@Consume("ProfesionService")
public class ProfesionService extends IService<PayloadProfesionResponse, PayloadProfesionRequest, Profesion> {

}
