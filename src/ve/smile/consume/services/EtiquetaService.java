package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Etiqueta;
import ve.smile.payload.request.PayloadEtiquetaRequest;
import ve.smile.payload.response.PayloadEtiquetaResponse;

@Consume("EtiquetaService")
public class EtiquetaService extends IService<PayloadEtiquetaResponse, PayloadEtiquetaRequest, Etiqueta> {

}
