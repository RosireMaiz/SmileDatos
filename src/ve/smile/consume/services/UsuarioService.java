package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Usuario;
import ve.smile.payload.request.PayloadUsuarioRequest;
import ve.smile.payload.response.PayloadUsuarioResponse;

@Consume("UsuarioService")
public class UsuarioService extends IService<PayloadUsuarioResponse, PayloadUsuarioRequest, Usuario> {

}
