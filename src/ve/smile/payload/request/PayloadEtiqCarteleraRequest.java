package ve.smile.payload.request;

import java.util.List;

import ve.smile.dto.EtiqCartelera;
import lights.core.payload.request.IPayloadRequest;

public class PayloadEtiqCarteleraRequest extends IPayloadRequest<EtiqCartelera> {

	private List<EtiqCartelera> objetos;

	private EtiqCartelera objeto;

	public PayloadEtiqCarteleraRequest() {
		super();
	}

	@Override
	public List<EtiqCartelera> getObjetos() {
		return objetos;
	}

	@Override
	public void setObjetos(List<EtiqCartelera> objetos) {
		this.objetos = objetos;
	}

	@Override
	public EtiqCartelera getObjeto() {
		return objeto;
	}

	@Override
	public void setObjeto(EtiqCartelera objeto) {
		this.objeto = objeto;
	}

}
