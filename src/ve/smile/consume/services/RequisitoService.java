package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Requisito;
import ve.smile.payload.request.PayloadRequisitoRequest;
import ve.smile.payload.response.PayloadRequisitoResponse;

@Consume("RequisitoService")
public class RequisitoService extends IService<PayloadRequisitoResponse, PayloadRequisitoRequest, Requisito> {

}
