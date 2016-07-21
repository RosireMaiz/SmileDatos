package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.NotificacionUsuario;
import ve.smile.payload.request.PayloadNotificacionUsuarioRequest;
import ve.smile.payload.response.PayloadNotificacionUsuarioResponse;

@Consume("NotificacionUsuarioService")
public class NotificacionUsuarioService extends IService<PayloadNotificacionUsuarioResponse, PayloadNotificacionUsuarioRequest, NotificacionUsuario> {

}
