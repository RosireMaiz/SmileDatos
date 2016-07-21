package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.CuentaBancaria;
import ve.smile.payload.request.PayloadCuentaBancariaRequest;
import ve.smile.payload.response.PayloadCuentaBancariaResponse;

@Consume("CuentaBancariaService")
public class CuentaBancariaService extends IService<PayloadCuentaBancariaResponse, PayloadCuentaBancariaRequest, CuentaBancaria> {

}
