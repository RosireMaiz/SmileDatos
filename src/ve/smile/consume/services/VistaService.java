package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Vista;
import ve.smile.payload.request.PayloadVistaRequest;
import ve.smile.payload.response.PayloadVistaResponse;

@Consume("VistaService")
public class VistaService extends IService<PayloadVistaResponse, PayloadVistaRequest, Vista> {

}
