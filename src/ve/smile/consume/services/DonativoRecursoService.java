package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.DonativoRecurso;
import ve.smile.payload.request.PayloadDonativoRecursoRequest;
import ve.smile.payload.response.PayloadDonativoRecursoResponse;

@Consume("DonativoRecursoService")
public class DonativoRecursoService extends IService<PayloadDonativoRecursoResponse, PayloadDonativoRecursoRequest, DonativoRecurso> {

}
