package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PermisoSeguridad;
import ve.smile.payload.request.PayloadPermisoSeguridadRequest;
import ve.smile.payload.response.PayloadPermisoSeguridadResponse;

@Consume("PermisoSeguridadService")
public class PermisoSeguridadService extends IService<PayloadPermisoSeguridadResponse, PayloadPermisoSeguridadRequest, PermisoSeguridad> {

}
