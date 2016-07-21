package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EventoFavoritoUsuario;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEventoFavoritoUsuarioRequest extends IPayloadRequest<EventoFavoritoUsuario> {

	private List<EventoFavoritoUsuario> objetos;

	private EventoFavoritoUsuario objeto;

	public PayloadEventoFavoritoUsuarioRequest() {
		super();
	}

	@Override
	public List<EventoFavoritoUsuario> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EventoFavoritoUsuario> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EventoFavoritoUsuario getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EventoFavoritoUsuario objeto) {
		this.objeto = objeto;
	}

}
