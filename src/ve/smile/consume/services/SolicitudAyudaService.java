package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.SolicitudAyuda;
import ve.smile.payload.request.PayloadSolicitudAyudaRequest;
import ve.smile.payload.response.PayloadSolicitudAyudaResponse;

@Consume("SolicitudAyudaService")
public class SolicitudAyudaService extends IService<PayloadSolicitudAyudaResponse, PayloadSolicitudAyudaRequest, SolicitudAyuda> {

}
