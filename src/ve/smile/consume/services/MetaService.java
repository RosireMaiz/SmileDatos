package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Meta;
import ve.smile.payload.request.PayloadMetaRequest;
import ve.smile.payload.response.PayloadMetaResponse;

@Consume("MetaService")
public class MetaService extends IService<PayloadMetaResponse, PayloadMetaRequest, Meta> {

}
