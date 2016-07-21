package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VistaOperacionBasico;
import ve.smile.payload.request.PayloadVistaOperacionBasicoRequest;
import ve.smile.payload.response.PayloadVistaOperacionBasicoResponse;

@Consume("VistaOperacionBasicoService")
public class VistaOperacionBasicoService extends IService<PayloadVistaOperacionBasicoResponse, PayloadVistaOperacionBasicoRequest, VistaOperacionBasico> {

}
