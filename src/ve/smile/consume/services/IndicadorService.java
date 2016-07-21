package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Indicador;
import ve.smile.payload.request.PayloadIndicadorRequest;
import ve.smile.payload.response.PayloadIndicadorResponse;

@Consume("IndicadorService")
public class IndicadorService extends IService<PayloadIndicadorResponse, PayloadIndicadorRequest, Indicador> {

}
