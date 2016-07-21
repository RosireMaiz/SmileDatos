package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.RedSocial;
import ve.smile.payload.request.PayloadRedSocialRequest;
import ve.smile.payload.response.PayloadRedSocialResponse;

@Consume("RedSocialService")
public class RedSocialService extends IService<PayloadRedSocialResponse, PayloadRedSocialRequest, RedSocial> {

}
