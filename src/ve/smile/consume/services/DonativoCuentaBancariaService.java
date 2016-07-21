package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.DonativoCuentaBancaria;
import ve.smile.payload.request.PayloadDonativoCuentaBancariaRequest;
import ve.smile.payload.response.PayloadDonativoCuentaBancariaResponse;

@Consume("DonativoCuentaBancariaService")
public class DonativoCuentaBancariaService extends IService<PayloadDonativoCuentaBancariaResponse, PayloadDonativoCuentaBancariaRequest, DonativoCuentaBancaria> {

}
