package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Participacion;
import ve.smile.payload.request.PayloadParticipacionRequest;
import ve.smile.payload.response.PayloadParticipacionResponse;

@Consume("ParticipacionService")
public class ParticipacionService extends IService<PayloadParticipacionResponse, PayloadParticipacionRequest, Participacion> {

}
