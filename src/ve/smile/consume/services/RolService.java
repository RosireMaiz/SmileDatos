package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Rol;
import ve.smile.payload.request.PayloadRolRequest;
import ve.smile.payload.response.PayloadRolResponse;

@Consume("RolService")
public class RolService extends IService<PayloadRolResponse, PayloadRolRequest, Rol> {

}
