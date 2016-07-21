package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.SolicitudAyudaRecurso;
import ve.smile.payload.request.PayloadSolicitudAyudaRecursoRequest;
import ve.smile.payload.response.PayloadSolicitudAyudaRecursoResponse;

@Consume("SolicitudAyudaRecursoService")
public class SolicitudAyudaRecursoService extends IService<PayloadSolicitudAyudaRecursoResponse, PayloadSolicitudAyudaRecursoRequest, SolicitudAyudaRecurso> {

}
