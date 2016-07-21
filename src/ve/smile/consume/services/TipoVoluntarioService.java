package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoVoluntario;
import ve.smile.payload.request.PayloadTipoVoluntarioRequest;
import ve.smile.payload.response.PayloadTipoVoluntarioResponse;

@Consume("TipoVoluntarioService")
public class TipoVoluntarioService extends IService<PayloadTipoVoluntarioResponse, PayloadTipoVoluntarioRequest, TipoVoluntario> {

}
