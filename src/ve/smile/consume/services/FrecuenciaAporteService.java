package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.FrecuenciaAporte;
import ve.smile.payload.request.PayloadFrecuenciaAporteRequest;
import ve.smile.payload.response.PayloadFrecuenciaAporteResponse;

@Consume("FrecuenciaAporteService")
public class FrecuenciaAporteService extends IService<PayloadFrecuenciaAporteResponse, PayloadFrecuenciaAporteRequest, FrecuenciaAporte> {

}
