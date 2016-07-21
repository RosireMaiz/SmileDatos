package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.RequisitoAyuda;
import ve.smile.payload.request.PayloadRequisitoAyudaRequest;
import ve.smile.payload.response.PayloadRequisitoAyudaResponse;

@Consume("RequisitoAyudaService")
public class RequisitoAyudaService extends IService<PayloadRequisitoAyudaResponse, PayloadRequisitoAyudaRequest, RequisitoAyuda> {

}
