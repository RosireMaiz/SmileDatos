package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Banco;
import ve.smile.payload.request.PayloadBancoRequest;
import ve.smile.payload.response.PayloadBancoResponse;

@Consume("BancoService")
public class BancoService extends IService<PayloadBancoResponse, PayloadBancoRequest, Banco> {

}
