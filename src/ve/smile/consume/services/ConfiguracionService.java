package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Configuracion;
import ve.smile.payload.request.PayloadConfiguracionRequest;
import ve.smile.payload.response.PayloadConfiguracionResponse;

@Consume("ConfiguracionService")
public class ConfiguracionService extends IService<PayloadConfiguracionResponse, PayloadConfiguracionRequest, Configuracion> {

}
