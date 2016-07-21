package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.RedSocialOrganizacion;
import ve.smile.payload.request.PayloadRedSocialOrganizacionRequest;
import ve.smile.payload.response.PayloadRedSocialOrganizacionResponse;

@Consume("RedSocialOrganizacionService")
public class RedSocialOrganizacionService extends IService<PayloadRedSocialOrganizacionResponse, PayloadRedSocialOrganizacionRequest, RedSocialOrganizacion> {

}
