package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Estado;
import ve.smile.payload.request.PayloadEstadoRequest;
import ve.smile.payload.response.PayloadEstadoResponse;

@Consume("EstadoService")
public class EstadoService extends IService<PayloadEstadoResponse, PayloadEstadoRequest, Estado> {

}
