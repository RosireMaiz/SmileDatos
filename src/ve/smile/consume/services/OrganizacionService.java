package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Organizacion;
import ve.smile.payload.request.PayloadOrganizacionRequest;
import ve.smile.payload.response.PayloadOrganizacionResponse;

@Consume("OrganizacionService")
public class OrganizacionService extends IService<PayloadOrganizacionResponse, PayloadOrganizacionRequest, Organizacion> {

}
