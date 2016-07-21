package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ComentarioAlbum;
import ve.smile.payload.request.PayloadComentarioAlbumRequest;
import ve.smile.payload.response.PayloadComentarioAlbumResponse;

@Consume("ComentarioAlbumService")
public class ComentarioAlbumService extends IService<PayloadComentarioAlbumResponse, PayloadComentarioAlbumRequest, ComentarioAlbum> {

}
