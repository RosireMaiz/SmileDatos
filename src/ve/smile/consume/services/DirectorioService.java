package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Directorio;
import ve.smile.payload.request.PayloadDirectorioRequest;
import ve.smile.payload.response.PayloadDirectorioResponse;

@Consume("DirectorioService")
public class DirectorioService extends IService<PayloadDirectorioResponse, PayloadDirectorioRequest, Directorio> {

}
