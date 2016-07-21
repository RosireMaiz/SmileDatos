package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MetodoDao;
import ve.smile.payload.request.PayloadMetodoDaoRequest;
import ve.smile.payload.response.PayloadMetodoDaoResponse;

@Consume("MetodoDaoService")
public class MetodoDaoService extends IService<PayloadMetodoDaoResponse, PayloadMetodoDaoRequest, MetodoDao> {

}
