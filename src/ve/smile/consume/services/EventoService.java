package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Evento;
import ve.smile.payload.request.PayloadEventoRequest;
import ve.smile.payload.response.PayloadEventoResponse;

@Consume("EventoService")
public class EventoService extends IService<PayloadEventoResponse, PayloadEventoRequest, Evento> {

}
