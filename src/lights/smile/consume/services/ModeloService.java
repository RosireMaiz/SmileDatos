package lights.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import lights.smile.dto.Modelo;
import lights.smile.payload.request.PayloadModeloRequest;
import lights.smile.payload.response.PayloadModeloResponse;

@Consume("ModeloService")
public class ModeloService extends IService<PayloadModeloResponse, PayloadModeloRequest, Modelo> {

}
