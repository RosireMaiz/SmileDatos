package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VoluntarioProfesion;
import ve.smile.payload.request.PayloadVoluntarioProfesionRequest;
import ve.smile.payload.response.PayloadVoluntarioProfesionResponse;

@Consume("VoluntarioProfesionService")
public class VoluntarioProfesionService extends IService<PayloadVoluntarioProfesionResponse, PayloadVoluntarioProfesionRequest, VoluntarioProfesion> {

}
