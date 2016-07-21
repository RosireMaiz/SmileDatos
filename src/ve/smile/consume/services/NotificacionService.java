package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Notificacion;
import ve.smile.payload.request.PayloadNotificacionRequest;
import ve.smile.payload.response.PayloadNotificacionResponse;

@Consume("NotificacionService")
public class NotificacionService extends IService<PayloadNotificacionResponse, PayloadNotificacionRequest, Notificacion> {

}
