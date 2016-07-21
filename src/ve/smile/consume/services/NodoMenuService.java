package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.NodoMenu;
import ve.smile.payload.request.PayloadNodoMenuRequest;
import ve.smile.payload.response.PayloadNodoMenuResponse;

@Consume("NodoMenuService")
public class NodoMenuService extends IService<PayloadNodoMenuResponse, PayloadNodoMenuRequest, NodoMenu> {

}
