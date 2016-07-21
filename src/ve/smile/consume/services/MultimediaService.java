package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Multimedia;
import ve.smile.payload.request.PayloadMultimediaRequest;
import ve.smile.payload.response.PayloadMultimediaResponse;

@Consume("MultimediaService")
public class MultimediaService extends IService<PayloadMultimediaResponse, PayloadMultimediaRequest, Multimedia> {

}
