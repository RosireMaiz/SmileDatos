package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventoFavoritoUsuario;
import ve.smile.payload.request.PayloadEventoFavoritoUsuarioRequest;
import ve.smile.payload.response.PayloadEventoFavoritoUsuarioResponse;

@Consume("EventoFavoritoUsuarioService")
public class EventoFavoritoUsuarioService extends IService<PayloadEventoFavoritoUsuarioResponse, PayloadEventoFavoritoUsuarioRequest, EventoFavoritoUsuario> {

}
