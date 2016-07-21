package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VistaOperacionCustom;
import ve.smile.payload.request.PayloadVistaOperacionCustomRequest;
import ve.smile.payload.response.PayloadVistaOperacionCustomResponse;

@Consume("VistaOperacionCustomService")
public class VistaOperacionCustomService extends IService<PayloadVistaOperacionCustomResponse, PayloadVistaOperacionCustomRequest, VistaOperacionCustom> {

}
