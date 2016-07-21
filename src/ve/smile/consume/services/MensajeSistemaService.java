package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MensajeSistema;
import ve.smile.payload.request.PayloadMensajeSistemaRequest;
import ve.smile.payload.response.PayloadMensajeSistemaResponse;

@Consume("MensajeSistemaService")
public class MensajeSistemaService extends IService<PayloadMensajeSistemaResponse, PayloadMensajeSistemaRequest, MensajeSistema> {

}
