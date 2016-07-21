package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Informacion;
import ve.smile.payload.request.PayloadInformacionRequest;
import ve.smile.payload.response.PayloadInformacionResponse;

@Consume("InformacionService")
public class InformacionService extends IService<PayloadInformacionResponse, PayloadInformacionRequest, Informacion> {

}
