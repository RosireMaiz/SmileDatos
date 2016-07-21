package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EstudioSocioEconomico;
import ve.smile.payload.request.PayloadEstudioSocioEconomicoRequest;
import ve.smile.payload.response.PayloadEstudioSocioEconomicoResponse;

@Consume("EstudioSocioEconomicoService")
public class EstudioSocioEconomicoService extends IService<PayloadEstudioSocioEconomicoResponse, PayloadEstudioSocioEconomicoRequest, EstudioSocioEconomico> {

}
