package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IconSclass;
import ve.smile.payload.request.PayloadIconSclassRequest;
import ve.smile.payload.response.PayloadIconSclassResponse;

@Consume("IconSclassService")
public class IconSclassService extends IService<PayloadIconSclassResponse, PayloadIconSclassRequest, IconSclass> {

}
