package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Padrino;
import ve.smile.payload.request.PayloadPadrinoRequest;
import ve.smile.payload.response.PayloadPadrinoResponse;

@Consume("PadrinoService")
public class PadrinoService extends IService<PayloadPadrinoResponse, PayloadPadrinoRequest, Padrino> {

}
