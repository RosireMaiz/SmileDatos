package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.UnidadMedida;
import ve.smile.payload.request.PayloadUnidadMedidaRequest;
import ve.smile.payload.response.PayloadUnidadMedidaResponse;

@Consume("UnidadMedidaService")
public class UnidadMedidaService extends IService<PayloadUnidadMedidaResponse, PayloadUnidadMedidaRequest, UnidadMedida> {

}
