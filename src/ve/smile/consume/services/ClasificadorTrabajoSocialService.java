package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorTrabajoSocial;
import ve.smile.payload.request.PayloadClasificadorTrabajoSocialRequest;
import ve.smile.payload.response.PayloadClasificadorTrabajoSocialResponse;

@Consume("ClasificadorTrabajoSocialService")
public class ClasificadorTrabajoSocialService extends IService<PayloadClasificadorTrabajoSocialResponse, PayloadClasificadorTrabajoSocialRequest, ClasificadorTrabajoSocial> {

}
