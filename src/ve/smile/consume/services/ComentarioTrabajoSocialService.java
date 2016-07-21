package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ComentarioTrabajoSocial;
import ve.smile.payload.request.PayloadComentarioTrabajoSocialRequest;
import ve.smile.payload.response.PayloadComentarioTrabajoSocialResponse;

@Consume("ComentarioTrabajoSocialService")
public class ComentarioTrabajoSocialService extends IService<PayloadComentarioTrabajoSocialResponse, PayloadComentarioTrabajoSocialRequest, ComentarioTrabajoSocial> {

}
