package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Sugerencia;
import ve.smile.payload.request.PayloadSugerenciaRequest;
import ve.smile.payload.response.PayloadSugerenciaResponse;

@Consume("SugerenciaService")
public class SugerenciaService extends IService<PayloadSugerenciaResponse, PayloadSugerenciaRequest, Sugerencia> {

}
