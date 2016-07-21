package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TrabajoSocial;
import ve.smile.payload.request.PayloadTrabajoSocialRequest;
import ve.smile.payload.response.PayloadTrabajoSocialResponse;

@Consume("TrabajoSocialService")
public class TrabajoSocialService extends IService<PayloadTrabajoSocialResponse, PayloadTrabajoSocialRequest, TrabajoSocial> {

}
