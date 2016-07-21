package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Patrocinador;
import ve.smile.payload.request.PayloadPatrocinadorRequest;
import ve.smile.payload.response.PayloadPatrocinadorResponse;

@Consume("PatrocinadorService")
public class PatrocinadorService extends IService<PayloadPatrocinadorResponse, PayloadPatrocinadorRequest, Patrocinador> {

}
