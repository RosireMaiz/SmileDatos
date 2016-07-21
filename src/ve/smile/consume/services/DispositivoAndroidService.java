package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.DispositivoAndroid;
import ve.smile.payload.request.PayloadDispositivoAndroidRequest;
import ve.smile.payload.response.PayloadDispositivoAndroidResponse;

@Consume("DispositivoAndroidService")
public class DispositivoAndroidService extends IService<PayloadDispositivoAndroidResponse, PayloadDispositivoAndroidRequest, DispositivoAndroid> {

}
